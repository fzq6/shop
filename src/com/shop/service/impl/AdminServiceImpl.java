package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.bean.Ausertable;
import com.shop.bean.AusertableExample;
import com.shop.mapper.AusertableMapper;
import com.shop.service.AdminService;

//�����AdminService��ʵ����
@Service
public class AdminServiceImpl implements AdminService{

	//��ȡmapper�ӿڶ���
	@Autowired
	AusertableMapper userMapper;
	
	@Override
	public List<Ausertable> queryAll() {
		//����mapper�Ĳ�ѯ������ѯ����
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
		// TODO��������ɾ��
		 int result = userMapper.deleteByPrimaryKey(name);
		return result>0;
	}

	@Override
	public Ausertable findAuserByKey(String name) {
		// TODO ����һ����������������ѯ��������
		return userMapper.selectByPrimaryKey(name);
	}

	@Override
	public boolean UpdateAusertable(Ausertable aUer,String key) {
		//���������޸�����
		//ͨ��example����޸�����
		AusertableExample example = new AusertableExample();
		example.createCriteria().andAnameEqualTo(key);
		int result = userMapper.updateByExampleSelective(aUer, example);
		return result>0;
	}

}
