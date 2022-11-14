package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Practice6 p =new Practice6();
		p.setup();
		p.test_window();

		
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}
	
	public void test_window() throws InterruptedException
	{
		String main_tab=driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> all_tabs = driver.getWindowHandles();
		
		for(String x:all_tabs)
		{
			if(!x.equals(main_tab))
			{
				driver.switchTo().window(x);
				WebElement y=driver.findElement(By.id("sampleHeading"));
				System.out.println(y.getText());
				Thread.sleep(3000);
				
				//driver.close();
				driver.quit();
			}
		}
	}
		

}
