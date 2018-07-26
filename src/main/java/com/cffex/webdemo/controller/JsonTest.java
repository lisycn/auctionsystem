package com.cffex.webdemo.controller;

import com.cffex.webdemo.bean.User;
import com.google.gson.Gson;

public class JsonTest {
	
	public static void main(String[] args) {
		User user = new User();
		Gson gson = new Gson();
		user.setAge(18);
		user.setId(1);
		user.setName("yhx");
		user.setSex("男");
		String userObject = gson.toJson(user);
		System.out.println(userObject);
		User user1 = gson.fromJson(userObject, User.class);
		System.out.println(user1);
	}
}
