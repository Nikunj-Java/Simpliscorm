package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//get List of users or RETRIVE DATA
	@GetMapping("/")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	
	 //get user By Id
	@GetMapping("/{id}")
	public ResponseEntity<User> getuserbyId(@PathVariable int id){
		User user= service.getUserById(id);
		if(user!=null)
			return new ResponseEntity<User>(user, HttpStatus.FOUND);
		else
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
		
	}
	//upadte user by id
	@PutMapping("/{id}")
	public ResponseEntity<Object>updateUserbyId(@RequestBody User user,@PathVariable int id){
		User data=service.updateUserById(user, id);
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User is Not Available",HttpStatus.NOT_FOUND);
	}
	

}
