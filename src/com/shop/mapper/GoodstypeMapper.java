package com.shop.mapper;

import com.shop.bean.Goodstype;
import com.shop.bean.GoodstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodstypeMapper {
    int countByExample(GoodstypeExample example);

    int deleteByExample(GoodstypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    List<Goodstype> selectByExample(GoodstypeExample example);

    Goodstype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByExample(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}