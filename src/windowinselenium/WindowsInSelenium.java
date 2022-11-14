package windowinselenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsInSelenium {

	String path = "";
	String actual_path="";
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WindowsInSelenium w=new WindowsInSelenium();
		w.set_up();
		w.test_window();

	}

	public void set_up() {
		path= System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
	}
	
	public void test_window() throws InterruptedException {
		
		String main_window = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.findElement(By.id("windowButton")).click();
	
		Set<String> all_window = driver.getWindowHandles();
		
		for(String x:all_window)
		{
			if(!x.equals(main_window))
			{
			driver.switchTo().window(x);
			
			
			WebElement second_window= driver.findElement(By.id("sampleHeading"));
			
			System.out.println(second_window.getText());
			Thread.sleep(3000);
			//driver.close();
			driver.quit();
			}
		}
	
		
		
	}
}
