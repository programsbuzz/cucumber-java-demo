package com.pb.cucumbertest.common;

public class MySingleton 
{
	private static MySingleton instance = null;
	
	public static MySingleton getInstance()
	{
		   if(instance == null) {
		         instance = new MySingleton();
		         System.out.println("intialize only once");
		      }
		      return instance;
	}
}
