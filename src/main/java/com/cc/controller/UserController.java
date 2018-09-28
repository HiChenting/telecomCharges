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

// 告诉spring mvc这是一个控制器类
@Controller
public class UserController {
	@Autowired
	UserService us;

	@RequestMapping("/loginForm")
	public String loginForm() {
		return "Login";
	}
	

	@RequestMapping("/indexFrom")
	@ResponseBody
	public String list(User user,HttpServletRequest request){
		String uname = user.getUser_account();
		String upsw = user.getUser_psw();
		//ModelAndView mav = new ModelAndView();
		List<User> ls= us.selectUserWithPowerId(uname,upsw);
		System.out.println("用户账号是"+uname);
		// 放入转发参数		
		// 放入jsp路径
		if(ls!=null) {
			request.getSession().setAttribute("ls", ls);
			//mav.addObject("ls", ls);
			//mav.setViewName("index_navi");
			return "success";
		}		
		return "fail";
	}
	
	@RequestMapping("/afterLogin")
	public String indexForm() {
		return "index";
	}
}
