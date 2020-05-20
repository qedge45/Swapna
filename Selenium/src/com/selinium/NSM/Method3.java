package com.selinium.NSM;

public class Method3 {
	
	//Method without return type with parameters
	//when ever we have without return type we use void
	   public void add(int a, int b)
	   {
		   int sum = a+b;
		   System.out.println(sum);
	   
	   }
	
	public static void main(String[] args) 
	{
		// calling a method with method name, since it  had no return type
        
		Method3 ns=new Method3();
		ns.add(30, 50);
		
	}

}
