package com.simplilearn.callbyvalue;

public class CallbyValue {	
	//class level variable , access using this keyword
	
	
	int num=150;
	
	void operation(int num) {
		this.num=num*10/100;
	}
	
	
	public static void main(String[] args) {
		
		CallbyValue obj= new CallbyValue();
		System.out.println("Value of num Before function Call: "+obj.num);
		
		obj.operation(100);
		
		System.out.println("Value of num After function Call: "+obj.num);
		
		
		
	}

}
