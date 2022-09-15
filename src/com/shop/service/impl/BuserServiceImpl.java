package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.bean.Ausertable;
import com.shop.bean.AusertableExample;
import com.shop.bean.Busertable;
import com.shop.bean.BusertableExample;
import com.shop.mapper.AusertableMapper;
import com.shop.mapper.BusertableMapper;
import com.shop.service.BuserService;

//�����BuserService��ʵ����
@Service
public class BuserServiceImpl implements BuserService{
	
	@Autowired
BusertableMapper buserMapper;
	
	@Override
	public List<Busertable> queryAll() {
		List<Busertable> list = buserMapper.selectByExample(new BusertableExample());
		return list;
	}

	//��¼��ʵ�ַ���
	@Override
	public Busertable bUserLogin(Busertable bUser) {
		BusertableExample example =new BusertableExample();
		example.createCriteria()
			.andBemailEqualTo(bUser.getBemail())
			.andBpwdEqualTo(bUser.getBpwd());
		List<Busertable> list = buserMapper.selectByExample(example);
		return (list.isEmpty()||list.size()<=0)?null:list.get(0);
	}

	//ע���ʵ�ַ���
	@Override
	public boolean insertBusertable(Busertable bUser) {
		int result = buserMapper.insertSelective(bUser);
		return result>0;
	}

	@Override
	public boolean deleteBusertable(int id) {
		 int result = buserMapper.deleteByPrimaryKey(id);
		return result>0;
	}
	@Override
	public Busertable findBuserByKey(int id) {
		// TODO ����һ����������������ѯ��������
		return buserMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean UpdateBusertable(Busertable bUser,String key) {
		//���������޸�����
		//ͨ��example����޸�����
		BusertableExample example = new BusertableExample();
		example.createCriteria().andBemailEqualTo(key);
		int result = buserMapper.updateByExampleSelective(bUser, example);
		return result>0;
	}

}
