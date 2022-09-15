package com.shop.mapper;

import com.shop.bean.Orderbasetable;
import com.shop.bean.OrderbasetableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderbasetableMapper {
    int countByExample(OrderbasetableExample example);

    int deleteByExample(OrderbasetableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderbasetable record);

    int insertSelective(Orderbasetable record);

    List<Orderbasetable> selectByExample(OrderbasetableExample example);

    Orderbasetable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderbasetable record, @Param("example") OrderbasetableExample example);

    int updateByExample(@Param("record") Orderbasetable record, @Param("example") OrderbasetableExample example);

    int updateByPrimaryKeySelective(Orderbasetable record);

    int updateByPrimaryKey(Orderbasetable record);
}