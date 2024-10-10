package com.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vendors {
	
	/*public void apple(WebDriver driver) throws InterruptedException {
		
	   //	//tagname[text()='text_value']
		driver.findElement(By.xpath("//span[text()='Apple']")).click();
		Thread.sleep(2000);
	}*/
	
	public void samsung(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span")).click();
		//driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		Thread.sleep(2000);
	}
	
	public void google(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span")).click();
		//driver.findElement(By.xpath("//span[text()='Google']")).click();
		Thread.sleep(2000);
	}
	
	public void oneplus(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span")).click();		
		//driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		Thread.sleep(2000);
	}
}
