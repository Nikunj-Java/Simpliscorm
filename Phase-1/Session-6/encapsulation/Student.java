package com.simplilearn.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	//getter method id
	public int getId() {
		return id;
	}
	//setter method for id
	public void setId(int id) {
		this.id=id;
	} 
	//setter method
	public void setName(String name) {
		this.name=name;
	}
	//getter method for name
	public String getName() {
		return name;
	}
	
	//setter method for email
	public void setEmail(String email) {
		this.email=email;
	}
	//getter method for email
	public String getEmail() {
		return email;
	}
	//setter method for password
	public void setPassword(String password) {
		this.password=password;
	}
	//getter method for password
	public String getPassword() {
		return password;
	}
	

}
