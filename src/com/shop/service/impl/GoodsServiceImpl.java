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
		// 商品添加和文件上传
		//1.文件上传
		//商品添加
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
	
	// 定义一个文件上传的方法，并返回图片名
	public String upLoad(MultipartFile detailImg) throws IOException {
	    if (!detailImg.getOriginalFilename().equals("")) {
	        // 上传文件路径
	        String path = "E:\\file";
	        try {
	            // 获取输出流
	            OutputStream os = new FileOutputStream(path + "\\" + detailImg.getOriginalFilename());
	            // 获取输入流 CommonsMultipartFile 中可以直接得到文件的流
	            BufferedInputStream is = new BufferedInputStream(detailImg.getInputStream());
	            byte[] buff = new byte[1024];
	            int temp;
	            // 一个一个字节的读取并写入
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
	    //返回文件名
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
