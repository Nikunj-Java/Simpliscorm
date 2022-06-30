package com.simplilearn.string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		
		String str= new String("Hello World");
		
		//convert string to stringbuffer
		StringBuffer s1= new StringBuffer(str);
		
		System.out.println("Size: "+s1.length());
		
		
		s1.append("Welcome");
		System.out.println(s1);
		
		
		s1.insert(11, " ");
		System.out.println(s1);
		
		s1.replace(12, 18, "Bye");
		System.out.println(s1);
		
		s1.reverse();
		
		System.out.println(s1);
	}

}
