package Day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   
   ChromeOptions object_name = new ChromeOptions();
   
    WebDriver driver =new ChromeDriver(object_name);
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    
    //driver.get("https://facebook.com");
    driver.get("https://google.com/");
	Thread.sleep(1000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
    driver.findElement(By.xpath("//button[@type='submit']"));
    driver.quit();
	}

}
