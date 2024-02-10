package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Fb_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Object_name = new ChromeDriver();
		Object_name.get("https://www.google.com/");
		Object_name.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		Object_name.findElement(By.xpath("//a[@role='button' and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tom");
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jerry");
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Blackdot@gmail.com");
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Blackdot@gmail.com");
		Thread.sleep(2000);
		Object_name.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Black@1234!");
	    
		WebElement dateElement =  Object_name.findElement(By.id("day"));
		WebElement monthElement =  Object_name.findElement(By.id("month"));
		WebElement yearElement =  Object_name.findElement(By.id("year"));
		
		Select dateDropdown = new Select(dateElement);
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		Thread.sleep(2000);
		
		dateDropdown.selectByVisibleText("10");
		monthDropdown.selectByVisibleText("Feb");
		yearDropdown.selectByVisibleText("1940");
		
		Object_name.findElement(By.xpath("//input[@type='radio' and @value='-1']")).click();
		Thread.sleep(2000);
		
		
		WebElement CustomElement = Object_name.findElement(By.xpath("//select[@class='_7-16 _9hk6 _5dba']"));
	    Select CustomDropdown =  new Select(CustomElement);
		CustomDropdown.selectByIndex(3);
		Thread.sleep(2000);
		Object_name.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Cartoon Characters");
		Object_name.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
		Thread.sleep(5000);
		Object_name.findElement(By.xpath("//div[@class='_6qfu _5lxt']")).click();
		Thread.sleep(3000);
		Object_name.findElement(By.xpath("//li[@role='presentation']")).click();
		Thread.sleep(1000);
		Object_name.findElement(By.xpath("//button[@class='_42ft _4jy0 layerConfirm _9l2j uiOverlayButton _4jy3 _4jy1 selected _51sy' and @type='submit']")).click();
		
		//FB Login and Logout
			  /*Object_name.findElement(By.xpath("//input[@type='text' and @id='email']")).sendKeys("Blackdot@gmail.com");
				Object_name.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys("Black@1234!");*/
		/*Object_name.findElement(By.xpath("//input[@type='text' and @id='email']")).sendKeys("Blackdot@gmail.com");
		  Object_name.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys("Black@5678!");
				Thread.sleep(2000);
				//Object_name.findElement(By.xpath("//button[@value='1']")).click();
				Object_name.findElement(By.xpath("(//a)[2]")).click();
				Object_name.findElement(By.xpath("//div[@class='_6qfu _5lxt']")).click();
				Thread.sleep(3000);
				Object_name.findElement(By.xpath("//li[@role='presentation']")).click();
				Thread.sleep(1000);
				Object_name.findElement(By.xpath("//button[@class='_42ft _4jy0 layerConfirm _9l2j uiOverlayButton _4jy3 _4jy1 selected _51sy' and @type='submit']")).click();*/
		
	}
		
  }
