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

	// ��ȡҵ���Ķ��� controller����service service����mapper
	@Autowired
	AdminService adminService;
	@Autowired
	TypeService typeService;
	// ����һ����������ѯadmin������
	@RequestMapping("/queryAllAdmin")
	public String queryAdmin(HttpServletRequest request) {
		// ����ҵ�������ѯ����
		List<Ausertable> adminList = adminService.queryAll();
		System.out.println(adminList);
		request.setAttribute("adminList", adminList);
		return "adminIndex";
	}

	@RequestMapping("/login")
	public String adminLogin(Ausertable aUser,HttpSession session) {
		// �ж��Ƿ��¼�ɹ�
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
			request.setAttribute("message", "�û�������Ϊ��");
			request.setAttribute("aUser", aUser);
			return "register";
		}
		if (aUser.getApwd() == null || aUser.getApwd().equals("")) {
			request.setAttribute("message", "���벻��Ϊ��");
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
		
	//ɾ��
	@RequestMapping("/delete")
	public String deleteAuser(String aname) {
		// �ж��Ƿ��¼�ɹ�
		adminService.deleteAusertable(aname);
		return "redirect:/admin/queryAllAdmin";
	}
	
	// ����һ����������ת�޸�ҳ��
			@RequestMapping("/Update")
			public String Update(String key, Ausertable aUer,HttpServletRequest request) {
				// ����ҵ������ɾ������
				boolean isok = adminService.UpdateAusertable(aUer, key);
				//�ж��Ƿ�ɹ��޸�
				if(isok) {
					return "redirect:/admin/queryAllAdmin";
				}else {
					return "redirect:/admin/toUpdate?aname"+key;
				}
				// ��ת���޸�ҳ��
				
			}

	
	// ����һ����������ת�޸�ҳ��
		@RequestMapping("/toUpdate")
		public String toUpdate(String aname, HttpServletRequest request) {
			// ����ҵ������ɾ������
			Ausertable aUser = adminService.findAuserByKey(aname);
			// ��������
			request.setAttribute("aUser", aUser);
			// ��ת���޸�ҳ��
			return "adminUpdate";
		}
}
