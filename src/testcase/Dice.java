package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dice {
	
	WebDriver driver=null;
	
	SoftAssert sa= new SoftAssert();
	

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murat\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dice.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

			
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(dataProvider="getData")
	public void searchJob(String jobTitle,String location) {
		
		String title=driver.getTitle();
		System.out.println(title);
		sa.assertEquals(title,"Find Jobs in Tech | Dice.com");
		
		driver.findElement(By.id("search-field-keyword")).sendKeys(jobTitle);
		driver.findElement(By.id("search-field-location")).clear();
		driver.findElement(By.id("search-field-location")).sendKeys(location);
		driver.findElement(By.id("findTechJobs")).click();
		
		String result=driver.findElement(By.id("posiCountId")).getText();
		
		System.out.println(result);
		/*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sa.assertTrue(number > 1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		driver.navigate().back();
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		
		data[0][0]="java developer";
		data[0][1]="va";
		data[1][0]="javascript developer";
		data[1][1]="va";
		data[2][0]="ruby developer";
		data[2][1]="va";
		
		return data;
		
	}

}
