package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioandcheckbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\May automations\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm ");
		
		
		driver.findElement(By.xpath("//input[@value='red']")).click();
		
		driver.findElement(By.xpath("//input[@value='yellow']")).click();
		
		driver.findElement(By.xpath("//html/body/div/div[3]/div/blockquote/form/input[3]")).click();
		
		
		
		
	}	
	}
		