package com.shop.service;
import java.util.List;

import com.shop.bean.Ausertable;
import com.shop.bean.Busertable;
public interface BuserService {

	//定义查询所有buser的业务接口方法
		public List<Busertable> queryAll();
	
	//定义一个登录操作
	public Busertable bUserLogin(Busertable bUser);
	
	//定义一个注册添加账号的方法
	public boolean insertBusertable(Busertable bUser);
	
	//删除用户
	public boolean deleteBusertable(int name);
	
	//修改用户
	public boolean UpdateBusertable(Busertable buser,String key);
		
	//定义一个方法根据主键查询对象
	public Busertable findBuserByKey(int name);
	
}
