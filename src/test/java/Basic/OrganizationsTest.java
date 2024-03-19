package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

public class OrganizationsTest 
{
	@Test
	public void CreateOrganizationsTest() throws IOException 
	{
		// creating the object propertyfileutil
		PropertyFileUtil putil = new PropertyFileUtil();

		// creating the object of webdriverutil
		WebDriverUtil wutil = new WebDriverUtil();

		WebDriver driver = new ChromeDriver();// here we craete obj of chromedriver class and upcasted to the webdriver
		// To Read data from property file
		String URL = putil.getDataFromPropertyFile("Url");
		String Username = putil.getDataFromPropertyFile("Username");
		String Password = putil.getDataFromPropertyFile("Password");
		
		//To display url and enter username and password
		driver.get(URL);
		
		//To maximize the window(call method from webdriverutil in commonutlis)
		wutil.manage(driver);
		
		//To apply wait for FindeElements method(call method from webdriverutil in commonutlis)
		wutil.Implicitwait(driver);
	    driver.findElement(By.name("user_name")).sendKeys(Username);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();
		
		
		
	}
}
