package com.mvn1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.browser.Browser_Confi;
import com.module.Add_To_Cart;
import com.module.Favurites;
import com.module.Filter;
import com.module.Login;
import com.module.Logout;
import com.module.Menu;
import com.module.Payment;
import com.module.Vendors;

public class Main {
	
	WebDriver driver=null;
	Login li=null;
	Add_To_Cart aCart=null;
	Favurites favurites=null;
	Filter fil=null;
	Logout lg=null;
	Menu m1=null;
	Payment p1=null;
	Vendors v1=null;
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException
	{
		driver=new Browser_Confi().ChromeBrowserSelection("chrome", "https://bstackdemo.com/");
		Thread.sleep(3000);
	}
	
	@BeforeTest
	public void beforetest()
	{
		li=new Login();
		aCart=new Add_To_Cart();
		favurites=new Favurites();
		fil=new Filter();
		lg=new Logout();
		m1=new Menu();
		p1=new Payment();
		v1=new Vendors();
		
	}
	
	@Test(priority = 0)
	public void loginDetails() throws InterruptedException
	{
		li.signin(driver);
		li.enterusername(driver);
		li.enterpassword(driver);
		li.login(driver);
	}
	
	@Test(priority = 1)
	public void addToCart() throws InterruptedException
	{
		aCart.addtocartlogo(driver);
	}
	
	@Test(priority = 2)
	public void Favurites() throws InterruptedException
	{
		favurites.favouriteicon(driver);
	}
	
	@Test(priority = 4)
	public void Menu() throws InterruptedException
	{
		m1.offer(driver);
		m1.order(driver);
		m1.favourite(driver);
	}
	@Ignore
	@Test(priority = 3)
	public void Filter() throws InterruptedException
	{
		fil=new Filter();
		fil.select(driver);
		
	}
	
	@Ignore
	@Test(priority = 5)
	public void Vendors() throws InterruptedException
	{
		//v1.apple(driver);
		v1.samsung(driver);
		v1.google(driver);
		v1.oneplus(driver);
	}
	
	@Test(priority = 6)
	public void Payment() throws InterruptedException
	{
		p1.AddToCart(driver);
		p1.checkout(driver);
		p1.firstname(driver, "charmi");
		p1.lastname(driver, "gandhi");
		p1.address(driver, "surat");
		p1.state(driver, "gujrat");
		p1.postelcode(driver, "123456");
		p1.submit(driver);
		p1.download(driver);
		p1.countinue(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		driver.close();	
		Thread.sleep(3000);
			
	}
}
