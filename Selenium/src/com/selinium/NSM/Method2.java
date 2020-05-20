package com.selinium.NSM;

public class Method2
{
   //method with return type without Parameter
	public int add()
	{
		int a=40;
		int b=30;
		int sum = a+b;
		
		// return type
		return sum;
					
	}
	
	public static void main(String[] args) 
	{
	  Method2 ns=new Method2();
	  int result=ns.add();
	  System.out.println(result);
	  
	}

}
