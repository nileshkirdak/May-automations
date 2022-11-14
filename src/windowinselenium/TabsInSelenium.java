package windowinselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabsInSelenium t=new TabsInSelenium();
		t.setup();
		t.test_tabs();

		
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
	}
	
	public void test_tabs() {
		
		String main_tab = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> all_tab = driver.getWindowHandles();
		
		for (String x:all_tab)
		{
			if(!x.equals(main_tab))
			{
				driver.switchTo().window(x);
				WebElement second_window=driver.findElement(By.id("sampleHeading"));
				System.out.println(second_window.getText());
				
			}
		}
		
	}
	
	
}
