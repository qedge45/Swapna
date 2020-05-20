package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTestg
{
	@Test
	public void validation()
	{
		String data="Selenium";
		String data1="Selenium";
		
		/*if(data.equals(data1)) // testng don't use If class for Validation
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		
		Assert.assertEquals(data, data1); //(Expected, Actual)
		
		
	}
	
	

}
