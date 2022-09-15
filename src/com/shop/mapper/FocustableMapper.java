package com.shop.mapper;

import com.shop.bean.Focustable;
import com.shop.bean.FocustableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FocustableMapper {
    int countByExample(FocustableExample example);

    int deleteByExample(FocustableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Focustable record);

    int insertSelective(Focustable record);

    List<Focustable> selectByExample(FocustableExample example);

    Focustable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Focustable record, @Param("example") FocustableExample example);

    int updateByExample(@Param("record") Focustable record, @Param("example") FocustableExample example);

    int updateByPrimaryKeySelective(Focustable record);

    int updateByPrimaryKey(Focustable record);
}