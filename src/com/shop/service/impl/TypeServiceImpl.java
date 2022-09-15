package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.bean.Goodstype;
import com.shop.bean.GoodstypeExample;
import com.shop.mapper.GoodstypeMapper;
import com.shop.service.TypeService;
@Service
public class TypeServiceImpl implements TypeService{
	
	//ªÒ»°mapper
	@Autowired
	GoodstypeMapper typeMarrer;
	@Override
	public List<Goodstype> queryAll() {
		// TODO Auto-generated method stub
		return typeMarrer.selectByExample(new GoodstypeExample());
	}

	@Override
	public boolean insertGoodsType(Goodstype type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGoodsType(Goodstype type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateGoodsType(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goodstype findTypeByKey(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
