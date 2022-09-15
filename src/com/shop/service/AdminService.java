package com.shop.service;

import java.util.List;

import com.shop.bean.Ausertable;

public interface AdminService {
	
	//�����ѯ����admin��ҵ��ӿڷ���
	public List<Ausertable> queryAll();
	
	//����һ����¼����
	public Ausertable aUserLogin(Ausertable aUser);
	
	//����һ��ע������˺ŵķ���
	public boolean insertAusertable(Ausertable aUser);
	
	//ɾ���û�
	public boolean deleteAusertable(String name);
	
	//�޸��û�
	public boolean UpdateAusertable(Ausertable aUer,String key);
	
	//����һ����������������ѯ����
	public Ausertable findAuserByKey(String name);
		

}
