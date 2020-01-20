package com.order.dao;

import com.order.entity.Test;

public interface TestMapper {
    int deleteByPrimaryKey(Integer a);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer a);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}