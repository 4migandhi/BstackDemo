package com.module;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_To_Cart {
WebDriver driver;
	
	
	public void addtocartlogo(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/span")).click();
		Thread.sleep(2000);
	}

}
