package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Confi {

	WebDriver driver=null;
	
	public WebDriver adgeBrowserSelection(String browser,String URL)
	{
		if(browser.equalsIgnoreCase("microsoft edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public WebDriver ChromeBrowserSelection(String browser,String URL)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public WebDriver FirefoxBrowserSelection(String browser,String URL)
	{
		if(browser.equalsIgnoreCase("fire fox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		return driver;
	}
}
