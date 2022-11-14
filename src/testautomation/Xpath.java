package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		// actual xpath

		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/form/div/div/input")).sendKeys("nilesh");
		
		//Relative Xpath
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nilesh");
		
		//complete page
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		
		//contains method
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		
		//start with
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten ')]")).click();
	}

}
