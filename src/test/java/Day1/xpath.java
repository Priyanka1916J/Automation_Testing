package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver Object_name = new ChromeDriver();
		Object_name.get("https://practice.expandtesting.com/login");
		Object_name.findElement(By.xpath("//input[@name='username']")).sendKeys("practice");
		Thread.sleep(3000);
		Object_name.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
		Object_name.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Object_name.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
	}
	

}
