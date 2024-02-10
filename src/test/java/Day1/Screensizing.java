package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
public class Screensizing {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	      
	      driver.get("https://google.com");
	      Thread.sleep(3000);
	      /*Options win = driver.manage();
	      win.window().fullscreen();*/
	      
	      /*driver.manage().window().minimize();
	      Thread.sleep(5000);
	      driver.manage().window().maximize();	
	      Thread.sleep(5000);
	      driver.manage().window().fullscreen();*/
	      
	      driver.manage().window().setSize(new Dimension(100,500));
	      
	      Thread.sleep(5000);
	      driver.close();
	}

}
