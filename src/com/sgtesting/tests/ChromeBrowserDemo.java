package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	
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
			oBrowser=new ChromeDriver();
			
			
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
