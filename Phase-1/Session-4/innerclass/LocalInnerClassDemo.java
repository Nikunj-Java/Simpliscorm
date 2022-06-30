package com.simplilearn.innerclass;

public class LocalInnerClassDemo {
	
	
	void check(int age) {
		if(age>18) {
			
			class Inner{
				void validate() {
					System.out.println("Validated");
				}
				
			}
			
			Inner inner= new Inner();
			inner.validate();
			
		}
		else {
			System.out.println("Not Valid");
		}
	}
	
	
	public static void main(String[] args) {
		
		LocalInnerClassDemo outer= new LocalInnerClassDemo();
		outer.check(22);
		
	}

}
