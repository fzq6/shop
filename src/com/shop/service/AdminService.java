package com.shop.service;

import java.util.List;

import com.shop.bean.Ausertable;

public interface AdminService {
	
	//定义查询所有admin的业务接口方法
	public List<Ausertable> queryAll();
	
	//定义一个登录操作
	public Ausertable aUserLogin(Ausertable aUser);
	
	//定义一个注册添加账号的方法
	public boolean insertAusertable(Ausertable aUser);
	
	//删除用户
	public boolean deleteAusertable(String name);
	
	//修改用户
	public boolean UpdateAusertable(Ausertable aUer,String key);
	
	//定义一个方法根据主键查询对象
	public Ausertable findAuserByKey(String name);
		

}
