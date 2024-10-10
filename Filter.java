package com.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filter {

	public void select(WebDriver driver) throws InterruptedException{
		
		WebElement e1=driver.findElement(By.xpath
				("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Lowest to highest");
		Thread.sleep(4000);
	}
	/*
	public void low_to_high(WebDriver driver) throws InterruptedException{

		WebElement e2= driver.findElement(By.name("Order by"));
		
		Select s2=new Select(e2);
		s2.selectByValue("Lowest to highest");
		Thread.sleep(2000);
	}
	
	public void high_to_low(WebDriver driver) throws InterruptedException{

		WebElement e3= driver.findElement(By.name("Order by"));
		
		Select s3=new Select(e3);
		s3.selectByValue("Highest to lowest");
		Thread.sleep(2000);
	}
	*/

}
