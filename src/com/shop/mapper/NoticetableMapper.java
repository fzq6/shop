package com.shop.mapper;

import com.shop.bean.Noticetable;
import com.shop.bean.NoticetableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticetableMapper {
    int countByExample(NoticetableExample example);

    int deleteByExample(NoticetableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Noticetable record);

    int insertSelective(Noticetable record);

    List<Noticetable> selectByExample(NoticetableExample example);

    Noticetable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Noticetable record, @Param("example") NoticetableExample example);

    int updateByExample(@Param("record") Noticetable record, @Param("example") NoticetableExample example);

    int updateByPrimaryKeySelective(Noticetable record);

    int updateByPrimaryKey(Noticetable record);
}