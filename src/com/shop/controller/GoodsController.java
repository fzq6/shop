package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.shop.bean.Goodstable;
import com.shop.service.GoodsService;


@Controller
@RequestMapping("/goods")
public class GoodsController {

	// ��ȡҵ���Ķ��� controller����service service����mapper
	@Autowired
	GoodsService goodsService;
	
	// ����һ����������ת�޸�ҳ��

	//@RequestParam("file") 
	@RequestMapping("/insert")
	 public String insert(MultipartFile file,Goodstable goods , HttpServletRequest request) {
		System.out.println("aaaa");
		  // ����ҵ�������ѯ����
		  boolean isok = goodsService.insertGoodstable(goods,file);
		  if(isok) {
		   //���²�ѯ--�ɹ�
		   return "index";
		  }
		  else {
		   //
		   request.setAttribute("message","��Ʒ����ʧ��");
		   request.setAttribute("goods",goods);
		   //ʧ��(������ת���޸�ҳ�棩
		   return "goodsInsert";
		  }
//			return "login";
		 }
		@RequestMapping("/hello")
		public String test() {
			return "index";
		}
	

}
