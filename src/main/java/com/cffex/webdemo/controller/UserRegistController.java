package com.cffex.webdemo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cffex.webdemo.bean.ReturnResult;
import com.cffex.webdemo.bean.User;
import com.cffex.webdemo.dao.UserDao;


@Controller
@RequestMapping("user")
public class UserRegistController {
	
	@Resource
	private UserDao userDao;
	
	@RequestMapping("/userTest.do")
	@ResponseBody
	public ReturnResult execute(HttpServletRequest req,HttpServletResponse resp){
		String name = userDao.findUserName();
		User user = userDao.findUserById(2);
		List<User> listUser = userDao.findUserAll();
		System.out.println(user);
//		try {
//			PrintWriter pw = resp.getWriter();
////			pw.print("success");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "success";
		ReturnResult rr = new ReturnResult();
		System.out.println(System.getProperty("catalina.home"));
		rr.setData(listUser);
		rr.setMsg("success");
		rr.setStatu(1);
		return rr;
		
	}
	
}



