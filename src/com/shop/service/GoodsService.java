package com.shop.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shop.bean.Goodstable;

public interface GoodsService {
	
	//�����ѯ����admin��ҵ��ӿڷ���
	public List<Goodstable> queryAll();
	
	//����һ��ע������˺ŵķ���
	public boolean insertGoodstable(Goodstable goods,MultipartFile file);
	
	//ɾ���û�
	public boolean deleteGoodstable(Goodstable goods);
	
	//�޸��û�
	public boolean UpdateGoodstable(int id,MultipartFile file);
	
	//����һ����������������ѯ����
	public Goodstable findGoodsByKey(int id);
		

}
