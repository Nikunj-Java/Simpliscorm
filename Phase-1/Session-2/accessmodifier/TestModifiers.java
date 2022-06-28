package com.simplilearn.accessmodifier;

public class TestModifiers {
	
	//another class with same package
	
	public static void main(String[] args) {
		AccessModifier obj= new AccessModifier();
		obj.methodPublic();
		obj.methodProtected();
		//obj.methodPrivate(); //this can't be access as it is private
		obj.methodDefalut();
	}

}
