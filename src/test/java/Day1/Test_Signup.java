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

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_Signup {
	WebDriver  Object_name;
  @Test
  public void sign_in() throws InterruptedException {
	  String Url ="https://practice.expandtesting.com/login";
	  System.out.println("Opening the Browser");
	
		Thread.sleep(1000);
	  Object_name=new ChromeDriver();
	  Object_name.get(Url);
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//input[@name='username']")).sendKeys("practice");
		Thread.sleep(3000);
		Object_name.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
		Object_name.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Object_name.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
	}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting/Running test on Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Testing is Finished");
	  Object_name.close();
  }

}
