package com.cffex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cffex.webdemo.dao.UserDao;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
@ContextConfiguration(locations = { "classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" }) 


@WebAppConfiguration
public class UserTest extends AbstractJUnit4SpringContextTests{	
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testUser(){
		String name = userDao.findUserName();
		System.out.println(name);
		System.out.println(System.getProperty("user.dir"));
	}
}