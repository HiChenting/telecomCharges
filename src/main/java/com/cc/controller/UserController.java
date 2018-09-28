package com.cc.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cc.entity.User;
import com.cc.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

// ����spring mvc����һ����������
@Controller
public class UserController {
	@Autowired
	UserService us;
	
	//�û���¼����
	@RequestMapping("loginForm")
	public String loginForm() {
		return "Login";
	}
	
	//�û���¼��ͨ���û����˺�����ѯ�û��������Ϣ
	@RequestMapping("indexFrom")
	@ResponseBody
	public String list(User user,HttpServletRequest request){	//ͨ��request�������index.jspҳ�洫�����Ĳ���
		String uname = user.getUser_account();
		String upsw = user.getUser_psw();
		//ModelAndView mav = new ModelAndView();
		List<User> ls= us.selectUserWithPowerId(uname,upsw);
		System.out.println("�û��˺���"+uname);
		// ����ת������		
		// ����jsp·��
		if(ls!=null) {
			request.getSession().setAttribute("ls", ls);
			//mav.addObject("ls", ls);
			//mav.setViewName("index_navi");
			return "success";									//������Ϣ��index��ajax
		}		
		return "fail";
	}
	
	//�û���¼����ݲ�ѯ������power_id��ʾ��ͬ��������
	@RequestMapping("afterLogin")
	public String indexForm() {
		return "index";
	}
	
	//��ʾ�û���Ϣ
	@RequestMapping("user_infoFrom")
	public String user_infoFrom() {
		return "user/user_info";
	}
}
