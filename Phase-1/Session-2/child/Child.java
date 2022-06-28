package com.simplilearn.child;

import com.simplilearn.accessmodifier.AccessModifier;

public class Child extends AccessModifier {
	
	//child class different package
	
	public static void main(String[] args) {
		
		Child obj= new Child();
		
		//child will be able to access protected and public propeties
		
		obj.methodProtected();
		obj.methodPublic();
		
		//obj.methodDefault();
		//obj.methodPrivate();
		
		
	}

}
