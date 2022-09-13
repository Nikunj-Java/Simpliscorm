package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//add method or CREATE RECORD
	
	public User addUser(User u) {
		return repo.save(u);
	}
	
	//List User Method
	
	public List<User> getAllUser(){
		return repo.findAll();
	}
	

}
