package com.selinium.NSM;

public class Method1
{
   //method with return type with Parameter
	public int add(int a, int b)
	{
       int sum=a+b;
       //return type
       return sum; 
     }
	
	public static void main(String[] args) 
	{
		Method1 ns=new Method1();	
		//calling Method with method Name, it won't return a value
		//ns.add(20, 30);
		//Calling a method with a varible,it will return a value
		int result=ns.add(20, 30); 
		System.out.println(result);
		
		
		}
}

