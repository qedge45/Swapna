package com.selenium.java;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetTest {
    //Hashset is collection of list which don't allow duplicate value
	// Iterator is another method of hashset 
	
	public static void main(String[] args) 
	{
		java.util.Set<String> h=new HashSet<>();
		h.add("Swapna");
		h.add("Sri");
		h.add("Belk");
		h.add("NC");
		System.out.println(h.size());
		
		/*for(String item : h)
		{
			System.out.println(item);
		}*/
		
		Iterator<String> it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
