package com.faceboook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.faceboook.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginBtn;
	   
	@FindBy(xpath="//img[@alt='Facebook']")
	WebElement logo;
		
	
   public LoginPage(){
	   PageFactory.initElements(driver, this);
	 
}
   public String validateTitle() {
	   return driver.getTitle();
   }
   public boolean validateLogo() {
	   return logo.isDisplayed();
   }
   public HomePage login(String un, String pwd) {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   LoginBtn.click();
	   return new HomePage();
	   
	   
   }
}

