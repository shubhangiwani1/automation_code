package cucumberpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	

	@Given("^I am on facebook application$")
	public void i_am_on_facebook_application()  {
		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
		

	@Given("User enters \"(.*)\" and \"(.*)\" LogIn$")
	public void user_enters_and_LogIn(String string, String string2) {
	
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
			  
	}

	@When("^I click on login button$")
	public void i_click_on_login_button()  {
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	}

	@Then("^I am able to login$")
	public void i_am_able_to_login() {
		driver.close();
		System.out.println("login verified");
		
	   
	}

}
