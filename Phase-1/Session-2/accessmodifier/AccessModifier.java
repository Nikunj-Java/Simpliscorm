package com.simplilearn.accessmodifier;

public class AccessModifier {
	
	
	public void methodPublic() {
		
		System.out.println("This is my public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is my Private Method");
	}
	
	void methodDefalut() {
		System.out.println("This is my default Method");
	}
	
	protected void methodProtected() {
		System.out.println("This is my Protected Method");
	}

	public static void main(String[] args) {
		
		///same  class able to access all type of modifiers
		AccessModifier obj= new AccessModifier();
		obj.methodPublic();
		obj.methodDefalut();
		obj.methodProtected();
		obj.methodPrivate();
		
		
	}
	
}
