package com.shop.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shop.bean.Goodstable;

public interface GoodsService {
	
	//定义查询所有admin的业务接口方法
	public List<Goodstable> queryAll();
	
	//定义一个注册添加账号的方法
	public boolean insertGoodstable(Goodstable goods,MultipartFile file);
	
	//删除用户
	public boolean deleteGoodstable(Goodstable goods);
	
	//修改用户
	public boolean UpdateGoodstable(int id,MultipartFile file);
	
	//定义一个方法根据主键查询对象
	public Goodstable findGoodsByKey(int id);
		

}
