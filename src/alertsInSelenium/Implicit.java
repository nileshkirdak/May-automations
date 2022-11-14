package alertsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {


	WebDriver driver;
	String path="";
	String actual_path ="";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Implicit i=new Implicit();
		i.setup();
		i.test_dropdown();
		i.test_dropdown1();
	}


	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
		
	}

	public void test_dropdown() throws InterruptedException 
	{
		WebElement btn_visible = driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());
	}


	public void test_dropdown1() throws InterruptedException 
	{
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		WebElement btn_visible = driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());
	}

	
}
