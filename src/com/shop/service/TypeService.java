package com.shop.service;

import java.util.List;

import com.shop.bean.Goodstype;

public interface TypeService {
	
	//�����ѯ����admin��ҵ��ӿڷ���
	public List<Goodstype> queryAll();
	
	//����һ��ע������˺ŵķ���
	public boolean insertGoodsType(Goodstype type);
	
	//ɾ���û�
	public boolean deleteGoodsType(Goodstype type);
	
	//�޸��û�
	public boolean UpdateGoodsType(int id);
	
	//����һ����������������ѯ����
	public Goodstype findTypeByKey(int id);
		

}
