package com.shop.mapper;

import com.shop.bean.Goodstable;
import com.shop.bean.GoodstableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodstableMapper {
    int countByExample(GoodstableExample example);

    int deleteByExample(GoodstableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodstable record);

    int insertSelective(Goodstable record);

    List<Goodstable> selectByExample(GoodstableExample example);

    Goodstable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodstable record, @Param("example") GoodstableExample example);

    int updateByExample(@Param("record") Goodstable record, @Param("example") GoodstableExample example);

    int updateByPrimaryKeySelective(Goodstable record);

    int updateByPrimaryKey(Goodstable record);
}