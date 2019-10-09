package com.example.demo.controller;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/get/{id}")
	@ResponseBody
	public String getUserById(String id) {
		System.out.println("+++++++++++++++++++++++++");
		try {
			User user = userDao.findById("1");
			
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(user);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	
	
	
	
	

}
