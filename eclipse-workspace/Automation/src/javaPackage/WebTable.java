package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers");

		//Number of columns in table

		List<WebElement> numberofcol=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("number of column: " +numberofcol.size());

		//Number of rows in table

		List<WebElement> numberofrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("number of rows: " +numberofrows.size());

		//total elements in table
		List<WebElement> totalElements = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		System.out.println("total Elements: "+totalElements.size());

		//list of all companies

		List<WebElement> allcomp = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("number of rows: " +allcomp.size());

		//price list
		List<WebElement> totalprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total Elements: "+totalprice.size());

		String ExpResult = "Humming Bird Educat";

		for (int i=0; i<allcomp.size();i++) {
			System.out.println(allcomp.get(i).getText());

			if (allcomp.get(i).getText().equalsIgnoreCase(ExpResult)) {
				System.out.println(allcomp.get(i).getText() +"----"+totalprice.get(i).getText());
				allcomp.get(i).click();
				System.out.println("comp clicked:-" +ExpResult);
				break;
				
			}

		}






	}

}
