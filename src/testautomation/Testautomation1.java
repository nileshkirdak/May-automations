package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testautomation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
	
		driver.findElement(By.xpath("//input[@name='username' and @type='text']")).click();

		
		  

		
		
		
		
	}

	
	
}
