package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;

@Component
public class UserDao {
	
	public User findById(String id) {
		return new  User("1", "name", "sex");
	}
}
