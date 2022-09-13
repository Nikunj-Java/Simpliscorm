package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestFulWebSeviceApplicationTests {

	@Autowired
	UserService service;
	
	
	@Test
	public void findAllUser() {
		
		System.out.println("Total No. of Users: "+service.getAllUser().size());
		assertEquals(3, service.getAllUser().size());
		assertNotEquals(7, service.getAllUser().size());
		
	}
	
	//find user by id
	
	@Test
	public void findById() {
		assertEquals("Nikunj",service.getUserById(1).getName());
	}
	 
	//create user
	@Disabled
	@Test
	public void addUser() {
		
		assertNotNull(service.addUser(new User("Jhon1", "jhon@gmail.com", "America")));
	}
	 
	//delete user
	@Test
	public void deleteUserById() {
		assertEquals(true, service.deleteUser(7));
	}
	 
	
	
}
