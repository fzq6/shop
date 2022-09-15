package com.shop.mapper;

import com.shop.bean.Busertable;
import com.shop.bean.BusertableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusertableMapper {
    int countByExample(BusertableExample example);

    int deleteByExample(BusertableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Busertable record);

    int insertSelective(Busertable record);

    List<Busertable> selectByExample(BusertableExample example);

    Busertable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Busertable record, @Param("example") BusertableExample example);

    int updateByExample(@Param("record") Busertable record, @Param("example") BusertableExample example);

    int updateByPrimaryKeySelective(Busertable record);

    int updateByPrimaryKey(Busertable record);
}