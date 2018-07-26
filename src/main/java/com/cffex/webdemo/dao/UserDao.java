package com.cffex.webdemo.dao;

import java.util.List;

import com.cffex.webdemo.bean.User;

public interface UserDao {
	
	public String findUserName();
	
	public User findUser();
	
	public List<User> findUserAll();
	
	public User findUserById(int id);
}
