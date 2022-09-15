package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.bean.Ausertable;
import com.shop.bean.AusertableExample;
import com.shop.mapper.AusertableMapper;
import com.shop.service.AdminService;

//这个是AdminService的实现类
@Service
public class AdminServiceImpl implements AdminService{

	//获取mapper接口对象
	@Autowired
	AusertableMapper userMapper;
	
	@Override
	public List<Ausertable> queryAll() {
		//调用mapper的查询方法查询数据
		List<Ausertable> list = userMapper.selectByExample(new AusertableExample());
		return list;
	}

	@Override
	public Ausertable aUserLogin(Ausertable aUser) {
		AusertableExample example =new AusertableExample();
		example.createCriteria()
			.andAnameEqualTo(aUser.getAname())
			.andApwdEqualTo(aUser.getApwd());
		List<Ausertable> list = userMapper.selectByExample(example);
		return (list.isEmpty()||list.size()<=0)?null:list.get(0);
	}

	@Override
	public boolean insertAusertable(Ausertable aUser) {
		int result =  userMapper.insertSelective(aUser);
		return result>0;
	}

	@Override
	public boolean deleteAusertable(String name) {
		// TODO根据主键删除
		 int result = userMapper.deleteByPrimaryKey(name);
		return result>0;
	}

	@Override
	public Ausertable findAuserByKey(String name) {
		// TODO 定义一个方法根据主键查询对象数据
		return userMapper.selectByPrimaryKey(name);
	}

	@Override
	public boolean UpdateAusertable(Ausertable aUer,String key) {
		//根据主键修改数据
		//通过example添加修改条件
		AusertableExample example = new AusertableExample();
		example.createCriteria().andAnameEqualTo(key);
		int result = userMapper.updateByExampleSelective(aUer, example);
		return result>0;
	}

}
