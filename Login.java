package com.module;

import static org.testng.Assert.fail;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	public void signin(WebDriver driver) throws InterruptedException{

		driver.findElement(By.id("signin")).click();
		Thread.sleep(2000);
	}
	
	public void enterusername(WebDriver driver )throws InterruptedException {
		
		driver.findElement(By.className("css-tlfecz-indicatorContainer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		Thread.sleep(2000);
	}
		
	public void enterpassword(WebDriver driver )throws InterruptedException {
		
		driver.findElement(By.className("css-tlfecz-indicatorContainer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		Thread.sleep(2000);
	}
	public void login(WebDriver driver )throws InterruptedException {	
		
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
		
	if(driver.getCurrentUrl().equals("https://bstackdemo.com/?signin=true"))
	{
		System.out.println("Your Login Test Has been Passed...");
	}
	else
	{
		System.out.println("Your Login Test Has been Failed...");
		fail("Login Failed");
	}
}
}
