package com.shop.service;

import java.util.List;

import com.shop.bean.Goodstype;

public interface TypeService {
	
	//定义查询所有admin的业务接口方法
	public List<Goodstype> queryAll();
	
	//定义一个注册添加账号的方法
	public boolean insertGoodsType(Goodstype type);
	
	//删除用户
	public boolean deleteGoodsType(Goodstype type);
	
	//修改用户
	public boolean UpdateGoodsType(int id);
	
	//定义一个方法根据主键查询对象
	public Goodstype findTypeByKey(int id);
		

}
