package com.module;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {

	public void offer(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("offers")).click();
		Thread.sleep(2000);
	}
		
	public void order(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("orders")).click();
		Thread.sleep(2000);
	}
	
	public void favourite(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("favourites")).click();
		Thread.sleep(2000);	
	}

}