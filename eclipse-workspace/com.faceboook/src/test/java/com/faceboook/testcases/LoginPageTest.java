package com.faceboook.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.faceboook.base.TestBase;
import com.faceboook.pages.HomePage;
import com.faceboook.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 lp =new LoginPage();
		
			
	}
	@Test (priority =1)
	public void loginPageTitle() {
		String title = lp.validateTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	@Test (priority =2)
	public void logoTest() {
		boolean flag = lp.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority =3)
	public void loginTest() {
		homepage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	 public void tearDown() {
		driver.quit();
	}

}
