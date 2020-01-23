# init

## 环境
maven3.5.2 + jdk1.8
## 配置过程
* [maven 仓库管理](https://github.com/gaoqiongxie/order/blob/master/pom.xml)	 

* [配置中心](https://github.com/gaoqiongxie/order/blob/master/src/main/resources/core.properties)	 
* [log4j配置](https://github.com/gaoqiongxie/order/blob/master/src/main/resources/log4j.xml)
* [spring-mybatis 配置](https://github.com/gaoqiongxie/order/blob/master/src/main/resources/spring/spring-mybatis.xml)	 
* [spring 配置](https://github.com/gaoqiongxie/order/blob/master/src/main/resources/spring/spring.xml)

## 读取 Excel 文件 生成 Mysql 数据库创建表结构 语句

### Excel 数据结构

| order_oms_sync | ERP订单变更同步表 |                                                |      |                                      |
| :------------: | :---------------: | :--------------------------------------------: | :--: | :----------------------------------: |
|      字段      |       类型        |                    是否必填                    | 索引 |                 描述                 |
|       id       |      int(11)      |                       *                        |  P   |                 主键                 |
|     erp_id     |      int(11)      |                       *                        |  I   |               单据标识               |
|       no       |    varchar(50)    |                       *                        |  I   |            订单编号 唯一             |
|     status     |    tinyint(4)     |                       *                        |      |       0:OMS待抽取; 1:OMS已抽取       |
|     remark     |   varchar(100)    |                       *                        |      | 备注(记录erp变更埋点):如合同信息变更 |
|  create_time   |     datetime      |               CURRENT_TIMESTAMP                |      |               创建时间               |
|  update_time   |     datetime      | CURRENT_TIMESTAMP  ON UPDATE CURRENT_TIMESTAMP |      |               修改时间               |



### Java

#### pom.xml

```
  <dependencies>
    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi</artifactId>
      <version>3.15</version>
    </dependency>
    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi-ooxml</artifactId>
      <version>3.15</version>
    </dependency>
  </dependencies>

```

#### excel.ExcelUtil.createTable(String, String)

```
1. 检查来源文件类型，是否xls或xlsx
2. 根据生成目录删除已有文件
3. 从第 N 张 Sheet 开始遍历
	3.1 遍历行，拼接 sql
	3.2 写入文件
```

####  生成表结构如下

```
DROP TABLE IF EXISTS order_oms_sync;
CREATE TABLE order_oms_sync ( 
	id int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	erp_id int(11) NOT NULL COMMENT '单据标识',
	no varchar(50) NOT NULL DEFAULT '' COMMENT '订单编号 唯一',
	status tinyint(4) NOT NULL COMMENT '0:OMS待抽取; 1:OMS已抽取',
	remark varchar(100) NOT NULL DEFAULT '' COMMENT '备注(记录erp变更埋点):如合同信息变更',
	create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   COMMENT '修改时间',
	PRIMARY KEY (`id`),
	KEY `erp_id` (`erp_id`),
	KEY `no` (`no`)
) ENGINE=InnoDB COMMENT='ERP订单变更同步表';
```



## 逆向生成

#### 1.导入jar

```
		<dependency>
			<groupId>org.mybatis.generator</groupId>
			<artifactId>mybatis-generator-core</artifactId>
			<version>1.3.6</version>
		</dependency>
```
#### 2.[mybatdis用于生成代码的配置文件](https://github.com/gaoqiongxie/order/blob/master/src/main/resources/generatorConfig.xml)及pom.xml配置

```
               <plugin>
			<groupId>org.mybatis.generator</groupId>
			<artifactId>mybatis-generator-maven-plugin</artifactId>
			<version>1.3.6</version>
			<configuration>
			<!-- mybatdis用于生成代码的配置文件 -->
			<configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
			<verbose>true</verbose>
			<overwrite>true</overwrite>
			</configuration>
		</plugin>
```
#### 3.可以通过以下启动

注意：mapper.xml 每次生成会叠加，所以重新生成时先删除文件

* mvn build… mybatis-generator:generate
* 启动类generator.MybatisGenerateApp

## 多数据源

涉及注解、切面、数据源、常量等

#### 步骤：

1. 数据源常量
2. 数据源注解
3. 多数据源配置类
4. 多数据源自动切换通知类 
5. 配置
   1. spring-mybatis.xml
   2. core.properties
6. 测试
