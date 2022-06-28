package com.simplilearn.child;

import com.simplilearn.accessmodifier.AccessModifier;

public class TestAccessInAnotherPackage {
	
	public static void main(String[] args) {
		AccessModifier obj= new AccessModifier();
		obj.methodPublic();
		//obj.methodDefalut();
		//obj.methodProtected();
		//obj.methodPrivate();
	}

}
