package com.simplilearn.exceptionhandling;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		
		try {
			
			int result=10/8;
			System.out.println("Result: "+result);
			
			
			int a[]= {1,2,3,4,5};
			System.out.println("Value at index 5: "+a[3]);
			
			
			String name=null;
			name.equals("user");
			
			
			Thread.sleep(100);
			
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("Arithmatic Exception: "+e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Index Exception: "+e.getMessage());
		}
		
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception: "+e.getMessage());
		}
		
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Error Working WIth Thread Exception: "+e.getMessage());
		}
		
		//should keep it last
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occured: "+e.getMessage());
			
		}
		
		
		
	}

}
