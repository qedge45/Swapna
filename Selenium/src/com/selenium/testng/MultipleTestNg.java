package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipleTestNg

{
	@Test (priority=1)//attribute is priority
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}	
	@Test (priority=2)
	public void appLogin()
	{
		System.out.println("appLogin");
	}	
	@Test (priority=3)
	public void appLogout()
	{
		System.out.println("appLogout");
	}
	@Test (priority=4)
	public void appClose()
	{
		System.out.println("appClose");
	}
	
	
}
