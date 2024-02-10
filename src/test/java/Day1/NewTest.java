package Day1;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver Test;
  @Test
  public void f() {
	  String Url ="https://github.com/";
	  System.out.println("Opening the Browser");
	  Test =new ChromeDriver();
	  Test.get(Url);
	  String CheckingTitle= "GitHub: Let’s build from here · GitHub";
	  String Github_original_title=Test.getTitle();
	   AssertJUnit.assertEquals(CheckingTitle, Github_original_title);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting/Running test on Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Testing is Finished");
  }
	  
  @AfterClass
  public void afterClass() throws  InterruptedException {
		
		  Test.close();
	  
	  
  }

}
