package com.simplilearn.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	
	@Id //primary key
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)// autoincrement
	private int id;
	
	@Column(name="student_name")
	private String name;
	private String email;
	private String password;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
