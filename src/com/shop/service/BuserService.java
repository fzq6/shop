package com.shop.service;
import java.util.List;

import com.shop.bean.Ausertable;
import com.shop.bean.Busertable;
public interface BuserService {

	//�����ѯ����buser��ҵ��ӿڷ���
		public List<Busertable> queryAll();
	
	//����һ����¼����
	public Busertable bUserLogin(Busertable bUser);
	
	//����һ��ע������˺ŵķ���
	public boolean insertBusertable(Busertable bUser);
	
	//ɾ���û�
	public boolean deleteBusertable(int name);
	
	//�޸��û�
	public boolean UpdateBusertable(Busertable buser,String key);
		
	//����һ����������������ѯ����
	public Busertable findBuserByKey(int name);
	
}
