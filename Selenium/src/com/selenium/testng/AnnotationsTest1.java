package com.selenium.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest1 
{
	@Test
	public void Method3()
	{
		System.out.println("Method3 Executed");
	}
	@Test
	public void Method4()
	{
		System.out.println("Method4 Executed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("AfterTest Executed");
	}
	
	
	
	
	
	
}
