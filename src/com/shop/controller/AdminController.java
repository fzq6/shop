package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.Ausertable;
import com.shop.bean.Goodstable;
import com.shop.bean.Goodstype;
import com.shop.service.AdminService;
import com.shop.service.TypeService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	// 获取业务层的对象 controller调用service service调用mapper
	@Autowired
	AdminService adminService;
	@Autowired
	TypeService typeService;
	// 定义一个方法来查询admin的请求
	@RequestMapping("/queryAllAdmin")
	public String queryAdmin(HttpServletRequest request) {
		// 调用业务层对象查询数据
		List<Ausertable> adminList = adminService.queryAll();
		System.out.println(adminList);
		request.setAttribute("adminList", adminList);
		return "adminIndex";
	}

	@RequestMapping("/login")
	public String adminLogin(Ausertable aUser,HttpSession session) {
		// 判断是否登录成功
		Ausertable login = adminService.aUserLogin(aUser);
		if (login != null) {
			List<Goodstype> AllCategoryList = typeService.queryAll();
			session.setAttribute("AllCategoryList",AllCategoryList);
			session.setAttribute("admin", login);
			//
			session.setAttribute("nowAdmin", login);
			return "index";
		} else {
			return "login";
		}

	}

	@RequestMapping("/register")
	public String adminregister(Ausertable aUser, HttpServletRequest request) {
		if (aUser.getAname() == null || aUser.getAname().equals("")) {
			request.setAttribute("message", "用户名不能为空");
			request.setAttribute("aUser", aUser);
			return "register";
		}
		if (aUser.getApwd() == null || aUser.getApwd().equals("")) {
			request.setAttribute("message", "密码不能为空");
			request.setAttribute("aUser", aUser);
			return "register";
		}
		boolean isok = adminService.insertAusertable(aUser);
		if (isok) {
			return "login";
		} else {
			return "register";
		}

	}
		
	//删除
	@RequestMapping("/delete")
	public String deleteAuser(String aname) {
		// 判断是否登录成功
		adminService.deleteAusertable(aname);
		return "redirect:/admin/queryAllAdmin";
	}
	
	// 定义一个方法来跳转修改页面
			@RequestMapping("/Update")
			public String Update(String key, Ausertable aUer,HttpServletRequest request) {
				// 调用业务层对象删除数据
				boolean isok = adminService.UpdateAusertable(aUer, key);
				//判断是否成功修改
				if(isok) {
					return "redirect:/admin/queryAllAdmin";
				}else {
					return "redirect:/admin/toUpdate?aname"+key;
				}
				// 跳转到修改页面
				
			}

	
	// 定义一个方法来跳转修改页面
		@RequestMapping("/toUpdate")
		public String toUpdate(String aname, HttpServletRequest request) {
			// 调用业务层对象删除数据
			Ausertable aUser = adminService.findAuserByKey(aname);
			// 保存数据
			request.setAttribute("aUser", aUser);
			// 跳转到修改页面
			return "adminUpdate";
		}
}
