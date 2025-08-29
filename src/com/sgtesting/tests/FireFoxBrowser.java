package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) {
		
		LaunchBrowser();
		navigateURL();
		closeApplication();
		display();
		
		
		
	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void display()
	{
		System.out.println("Hello world");
		System.out.println("This is java selenium");
		System.out.println("Good Luck");
		
		System.out.println("PostJira1");
		System.out.println("PostJira2");
		System.out.println("PostJira3");
		System.out.println("PostJira4");
		System.out.println("PostJira5");
		System.out.println("PostJira6");
		System.out.println("PostJira7");
	}
	
	private static void navigateURL()
	{
		try
		{
			
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(5000);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
