package com.shop.service.impl;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.shop.bean.Goodstable;
import com.shop.mapper.GoodstableMapper;
import com.shop.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	GoodstableMapper goodsMapper; 
	
	@Override
	public List<Goodstable> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean insertGoodstable(Goodstable goods,MultipartFile file) {
		// ��Ʒ��Ӻ��ļ��ϴ�
		//1.�ļ��ϴ�
		//��Ʒ���
		String filename =null;
		try {
			filename = upLoad(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goods.setGpicture(filename);
		int result = goodsMapper.insertSelective(goods);
		return result>0;
	}
	
	// ����һ���ļ��ϴ��ķ�����������ͼƬ��
	public String upLoad(MultipartFile detailImg) throws IOException {
	    if (!detailImg.getOriginalFilename().equals("")) {
	        // �ϴ��ļ�·��
	        String path = "E:\\file";
	        try {
	            // ��ȡ�����
	            OutputStream os = new FileOutputStream(path + "\\" + detailImg.getOriginalFilename());
	            // ��ȡ������ CommonsMultipartFile �п���ֱ�ӵõ��ļ�����
	            BufferedInputStream is = new BufferedInputStream(detailImg.getInputStream());
	            byte[] buff = new byte[1024];
	            int temp;
	            // һ��һ���ֽڵĶ�ȡ��д��
	            while ((temp = is.read(buff)) != (-1)) {
	                os.write(buff, 0, temp);
	            }
	            os.flush();
	            os.close();
	            is.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	    //�����ļ���
	    return detailImg.getOriginalFilename();
	}
	
	@Override
	public boolean deleteGoodstable(Goodstable goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateGoodstable(int id,MultipartFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goodstable findGoodsByKey(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
