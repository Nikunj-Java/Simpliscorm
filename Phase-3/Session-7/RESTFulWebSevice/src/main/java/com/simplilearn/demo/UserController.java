package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	//create New record
	@PostMapping("/")
	public ResponseEntity<User> adduser(@RequestBody User u){
		User user= service.addUser(u);
		
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<User>(user,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
