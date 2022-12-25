package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass {
	
	static WebDriver driver;
	
	@FindBy (xpath ="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	public PageFactoryClass(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
				
	}
	
	public void enterEmail() {
		
		Email.sendKeys("ABCD");
	}
	public void enterpassword() {
		password.sendKeys("pass");
		
	}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32_recent\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	PageFactoryClass pfc = new PageFactoryClass(driver);
	pfc.enterEmail();
	pfc.enterpassword();
	
	
}
}
