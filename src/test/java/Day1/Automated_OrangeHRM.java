package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automated_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='https://www.orangehrm.com/']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.manage().window().fullscreen();
	
		driver.findElement(By.xpath("(//a)[2]")).click(); 
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("(//a)[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[6]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[7]")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//a[@herf='https://opensource-demo.orangehrmlive.com/web/index.php/performance/viewPerformanceModule']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@herf='https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[10]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a)[11]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("(//a)[12]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	} 
}
