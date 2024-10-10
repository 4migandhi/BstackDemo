package com.module;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout {

	public void logout(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.id("logout")).click();
		Thread.sleep(5000);
		
	}
}
