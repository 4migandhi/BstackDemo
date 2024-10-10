package com.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

public class Payment {
	
	public void AddToCart(WebDriver driver)throws InterruptedException {
		
		// //tagname[@attr_name='attr_value']
		driver.findElement(By.xpath("//div[@class='shelf-item__buy-btn']")).click();		
		//driver.findElement(By.cssSelector("shelf-item__buy-btn")).click();
		Thread.sleep(2000);
	}
	
	/*public void addtocartlogo(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/span")).click();
		Thread.sleep(2000);
	}*/
	
	public void checkout(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
	}
	
	public void firstname(WebDriver driver,String firstname ) throws InterruptedException {
		
		driver.findElement(By.id("firstNameInput")).sendKeys("charmi");;
		Thread.sleep(2000);
	}
	
	public void lastname(WebDriver driver,String lastname ) throws InterruptedException {
		
		driver.findElement(By.id("lastNameInput")).sendKeys("gandhi");;
		Thread.sleep(2000);
	}
	
	public void address(WebDriver driver,String address ) throws InterruptedException {
		
		driver.findElement(By.id("addressLine1Input")).sendKeys("surat");;
		Thread.sleep(2000);
	}
	
	public void state(WebDriver driver,String state ) throws InterruptedException {
		
		driver.findElement(By.id("provinceInput")).sendKeys("gujrat");;
		Thread.sleep(2000);
	}
	
	public void postelcode(WebDriver driver,String postelcode ) throws InterruptedException {
		
		driver.findElement(By.id("postCodeInput")).sendKeys("123456");;
		Thread.sleep(2000);
	}
	
	public void submit(WebDriver driver ) throws InterruptedException {
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		Thread.sleep(2000);
	}
	
	public void download(WebDriver driver ) throws InterruptedException {
		
		driver.findElement(By.id("downloadpdf")).click();
		Thread.sleep(2000);
	}
	
	public void countinue(WebDriver driver ) throws InterruptedException {
		
		driver.findElement(By.cssSelector
				("button.button.button--tertiary.optimizedCheckout-buttonSecondary")).click();
		Thread.sleep(2000);
	}
}
