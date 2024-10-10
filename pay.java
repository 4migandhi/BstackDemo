package com.module;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pay {
	WebDriver driver;

	@Test
	public void before() throws InterruptedException{

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	
	
	//public void test() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstNameInput")).sendKeys("charmi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastNameInput")).sendKeys("gandhi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("addressLine1Input")).sendKeys("surat");
		Thread.sleep(2000);
		
		driver.findElement(By.id("provinceInput")).sendKeys("Gujrat");
		Thread.sleep(2000);
		
		driver.findElement(By.id("postCodeInput")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("downloadpdf")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector
				("button.button.button--tertiary.optimizedCheckout-buttonSecondary")).click();
		Thread.sleep(2000);
	}

}
