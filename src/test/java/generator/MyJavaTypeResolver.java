package generator;

import java.sql.Types;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * 自定义数据类型
 * @author xiegaoqiong
 *
 */
public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {
	public MyJavaTypeResolver() {
		super();
//		super.typeMap.put(-6, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT",
//				new FullyQualifiedJavaType(Integer.class.getName())));
		super.typeMap.put(Types.TINYINT, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT",
				new FullyQualifiedJavaType(Integer.class.getName())));
	}
}
