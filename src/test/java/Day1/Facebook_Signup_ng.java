package Day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Facebook_Signup_ng {
	 WebDriver driver;
  @Test
  public void Signup_page() throws  InterruptedException{
	  driver.findElement(By.xpath("//a[@role='button' and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Joey");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tribiani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Joey@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Joey@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Joey@1234!");
	    
		WebElement dateElement =  driver.findElement(By.id("day"));
		WebElement monthElement = driver.findElement(By.id("month"));
		WebElement yearElement =  driver.findElement(By.id("year"));
		
		Select dateDropdown = new Select(dateElement);
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		Thread.sleep(2000);
		
		dateDropdown.selectByVisibleText("15");
		monthDropdown.selectByVisibleText("Aug");
		yearDropdown.selectByVisibleText("1969");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1lch']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		
  }
  
  @BeforeMethod
  public void beforeMethod() throws  InterruptedException {
	  driver.get("https://google.com/");
		Thread.sleep(1000);
		driver.get("http://facebook.com");
		System.out.println("Current URL ID" +driver.getCurrentUrl());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Current URL ID" +driver.getCurrentUrl());
	  
  }

  @BeforeClass 
	  public void BroswerTestsetup() {
		  System.out.println("Open the Browser");
		  driver =new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  
  }

  @AfterClass
  public void afterClass() throws  InterruptedException {
	  Thread.sleep(1000);
	  driver.close();
  }

}
