package com.simplilearn.string;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		String s1= new String("Hello World");
		char c= s1.charAt(6);
		
		System.out.println("Character at Index 6: "+c);
		
		String str=s1.toLowerCase();
		System.out.println("Lowercase: "+str);
		
		System.out.println("UPPERCASE: "+s1.toUpperCase() );
		
		
		System.out.println("Check String Contains: "+ s1.contains("World"));
		
		System.out.println("Sub String between 6 to 8: "+s1.substring(6,8));
		
		String result []=s1.split(" ");
		
		for (String s: result) {
			System.out.println(s);
		}
		
		
		String s2= "hello world";
		
		if(s1.equalsIgnoreCase(s2))  
			System.out.println("Validated");
		else
			System.out.println("Not Validated");
		

		
	}

}
