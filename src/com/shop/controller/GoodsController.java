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

	// 获取业务层的对象 controller调用service service调用mapper
	@Autowired
	GoodsService goodsService;
	
	// 定义一个方法来跳转修改页面

	//@RequestParam("file") 
	@RequestMapping("/insert")
	 public String insert(MultipartFile file,Goodstable goods , HttpServletRequest request) {
		System.out.println("aaaa");
		  // 调用业务层对象查询数据
		  boolean isok = goodsService.insertGoodstable(goods,file);
		  if(isok) {
		   //重新查询--成功
		   return "index";
		  }
		  else {
		   //
		   request.setAttribute("message","商品发布失败");
		   request.setAttribute("goods",goods);
		   //失败(重新跳转到修改页面）
		   return "goodsInsert";
		  }
//			return "login";
		 }
		@RequestMapping("/hello")
		public String test() {
			return "index";
		}
	

}
