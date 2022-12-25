package javaPackage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@DataProvider (parallel=true)

	public Object[][] sendData(){
		Object array [][] = new Object [2][2];
		array [0] [0] = "shubhangi@gamil.com";
		array [0] [1] = "chrome";
		array [1] [0] = "shreeyanh";
		array [1] [1] = "chrome";


		return array;

	}

	@Test(dataProvider = "sendData")

	public void login(String username,String browsername) throws Exception{
		

	 if (browsername.equalsIgnoreCase("Chrome")) {

			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);

			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:5556/wd/hub"),cap);
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();

			driver.findElement(By.id("email")).sendKeys(username);
			driver.quit();
			Thread.sleep(3000);

		}


	}

}


