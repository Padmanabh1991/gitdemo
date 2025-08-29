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
		display1();
		
		
		
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
		System.out.println("This is firefox Driver");
	}
	
	private static void display1()
	{
		System.out.println("Hii Hello there");
		System.out.println("This is web automation");
		System.out.println("This is awesome");
		System.out.println("Thank You");
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
