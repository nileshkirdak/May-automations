package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {


	WebDriver driver;
	String path="";
	String actual_path ="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice2 p2=new Practice2();
		p2.setup();
		
		p2.select();
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
	}
	
	public void select() {
		
		WebElement n =driver.findElement(By.name("country"));
		
		
		Select s=new Select(n);
		
		
		s.selectByValue("BHUTAN");
	}
	
}
