package com.selinium.SM;

public class Method1 {
	
	// Static method with return type with Parameter
		public static int add(int a, int b)
		{
	       int sum=a+b;
	       //return type
	       return sum; 
	     }
		

	public static void main(String[] args) {
		// calling static methods
		// no need to create a object reference
		//syntax: classname.methodname
		
		int result=Method1.add(20, 30);
		System.out.println(result);
		
		
		
		
	}	

}
