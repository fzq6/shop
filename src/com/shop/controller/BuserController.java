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

		// ����һ����������ѯbuser������
		@RequestMapping("/queryAllBuser")
		public String querybuser(HttpServletRequest request) {
			// ����ҵ�������ѯ����
			List<Busertable> buserList = buserService.queryAll();
			
			request.setAttribute("buserList", buserList);
			return "buserIndex";
		}
		
		//����һ��������¼buser
		@RequestMapping("/login")
		public String buserLogin(Busertable bUser) {
			// �ж��Ƿ��¼�ɹ�
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
				request.setAttribute("message", "email����Ϊ��");
				request.setAttribute("bUser", bUser);
				return "register";
			}
			if (bUser.getBpwd() == null || bUser.getBpwd().equals("")) {
				request.setAttribute("message", "���벻��Ϊ��");
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
		
		//ɾ��
		@RequestMapping("/delete")
		public String deleteBuser(int id) {
			// �ж��Ƿ��¼�ɹ�
			buserService.deleteBusertable(id);
			return "redirect:/buser/queryAllBuser";
		}
		
		// ����һ����������ת�޸�ҳ��
					@RequestMapping("/Update")
					public String Update(String key, Busertable bUser,HttpServletRequest request) {
						// ����ҵ������ɾ������
						boolean isok = buserService.UpdateBusertable(bUser, key);
						//�ж��Ƿ�ɹ��޸�
						if(isok) {
							return "redirect:/buser/queryAllBuser";
						}else {
							return "redirect:/buser/toUpdate?bUser"+key;
						}
						// ��ת���޸�ҳ��
						
					}

			
			// ����һ����������ת�޸�ҳ��
				@RequestMapping("/toUpdate")
				public String toUpdate(int id, HttpServletRequest request) {
					// ����ҵ������ɾ������
					Busertable bUser = buserService.findBuserByKey(id);
					// ��������
					System.out.println(bUser);
					request.setAttribute("bUser", bUser);
					// ��ת���޸�ҳ��
					return "buserUpdate";
				}
		
}
