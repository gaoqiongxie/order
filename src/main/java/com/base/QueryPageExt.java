package com.base;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;
import java.io.Serializable;
import org.hibernate.validator.constraints.Range;


/**
 * <p>Description: 分页查询扩展对象 </p >
 * Created on 2019/11/29
 *
 * @author <a href="mailto:wangtengjiao@fehorizon.com">汪腾蛟</a>
 * @version 1.0
 * Copyright (c) 2019 上海宏信建设
 */
@Data
public class QueryPageExt implements Serializable {
	
    private static final long serialVersionUID = 1262247763026515127L;
    
    @ApiModelProperty(value = "请求第几页")
    @Range(min = 1, message = "请求页数最小1")
    private int startPage = 1;

    @ApiModelProperty(value = "每页请求记录数")
    @Range(min = 1, max = 100, message = "每页请求记录数最小1最大100")
    private int pageSize = 20;

    /** 排序 */
    private String orders;

    /** limit */
    private String dataLimit;

    @ApiIgnore
    public Integer getStart() {
        if (startPage < 0 || pageSize < 0) {
            return 0;
        } else {
            return ((startPage - 1) * pageSize);
        }
    }
}
