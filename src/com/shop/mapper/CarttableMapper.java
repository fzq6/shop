package com.shop.mapper;

import com.shop.bean.Carttable;
import com.shop.bean.CarttableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarttableMapper {
    int countByExample(CarttableExample example);

    int deleteByExample(CarttableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carttable record);

    int insertSelective(Carttable record);

    List<Carttable> selectByExample(CarttableExample example);

    Carttable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carttable record, @Param("example") CarttableExample example);

    int updateByExample(@Param("record") Carttable record, @Param("example") CarttableExample example);

    int updateByPrimaryKeySelective(Carttable record);

    int updateByPrimaryKey(Carttable record);
}