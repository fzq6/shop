package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.bean.Busertable;
import com.shop.bean.Busertable;
import com.shop.service.BuserService;
import com.shop.service.BuserService;


@Controller
@RequestMapping("/buser")
public class BuserController {
		@Autowired
		BuserService buserService;

		// 定义一个方法来查询buser的请求
		@RequestMapping("/queryAllBuser")
		public String querybuser(HttpServletRequest request) {
			// 调用业务层对象查询数据
			List<Busertable> buserList = buserService.queryAll();
			
			request.setAttribute("buserList", buserList);
			return "buserIndex";
		}
		
		//定义一个方法登录buser
		@RequestMapping("/login")
		public String buserLogin(Busertable bUser) {
			// 判断是否登录成功
			Busertable login = buserService.bUserLogin(bUser);
			if (login != null) {
				return "buserIndex";
			} else {
				return "buserlogin";
			}

		}

		@RequestMapping("/register")
		public String buserregister(Busertable bUser, HttpServletRequest request) {
			if (bUser.getBemail() == null || bUser.getBemail().equals("")) {
				request.setAttribute("message", "email不能为空");
				request.setAttribute("bUser", bUser);
				return "register";
			}
			if (bUser.getBpwd() == null || bUser.getBpwd().equals("")) {
				request.setAttribute("message", "密码不能为空");
				request.setAttribute("bUser", bUser);
				return "register";
			}
			boolean isok = buserService.insertBusertable(bUser);
			if (isok) {
				return "buserlogin";
			} else {
				return "buserregister";
			}

		}
		
		//删除
		@RequestMapping("/delete")
		public String deleteBuser(int id) {
			// 判断是否登录成功
			buserService.deleteBusertable(id);
			return "redirect:/buser/queryAllBuser";
		}
		
		// 定义一个方法来跳转修改页面
					@RequestMapping("/Update")
					public String Update(String key, Busertable bUser,HttpServletRequest request) {
						// 调用业务层对象删除数据
						boolean isok = buserService.UpdateBusertable(bUser, key);
						//判断是否成功修改
						if(isok) {
							return "redirect:/buser/queryAllBuser";
						}else {
							return "redirect:/buser/toUpdate?bUser"+key;
						}
						// 跳转到修改页面
						
					}

			
			// 定义一个方法来跳转修改页面
				@RequestMapping("/toUpdate")
				public String toUpdate(int id, HttpServletRequest request) {
					// 调用业务层对象删除数据
					Busertable bUser = buserService.findBuserByKey(id);
					// 保存数据
					System.out.println(bUser);
					request.setAttribute("bUser", bUser);
					// 跳转到修改页面
					return "buserUpdate";
				}
		
}
