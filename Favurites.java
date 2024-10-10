package com.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Favurites {

	public void favouriteicon(WebDriver driver) throws InterruptedException{

		//driver.findElement(By.cssSelector("shelf-item__buy-btn")).click();
		//Thread.sleep(2000);
		
		// using css class locator
		driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.Icon")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"1\"]/div[1]/button/span[1]/svg/path")).click();
		Thread.sleep(2000);
	}
}
