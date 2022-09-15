package com.shop.mapper;

import com.shop.bean.Ausertable;
import com.shop.bean.AusertableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AusertableMapper {
    int countByExample(AusertableExample example);

    int deleteByExample(AusertableExample example);

    int deleteByPrimaryKey(String aname);

    int insert(Ausertable record);

    int insertSelective(Ausertable record);

    List<Ausertable> selectByExample(AusertableExample example);

    Ausertable selectByPrimaryKey(String aname);

    int updateByExampleSelective(@Param("record") Ausertable record, @Param("example") AusertableExample example);

    int updateByExample(@Param("record") Ausertable record, @Param("example") AusertableExample example);

    int updateByPrimaryKeySelective(Ausertable record);

    int updateByPrimaryKey(Ausertable record);
}