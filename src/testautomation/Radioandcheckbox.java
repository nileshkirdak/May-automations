package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioandcheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\May automations\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		
		WebElement Option1 = driver.findElement(By.xpath("//input[@value='Option 1']"));
		
		Option1.click();
		System.out.println(driver.getTitle());
		
		System.out.println(Option1.getText());
		
		System.out.println(Option1.getAttribute("value"));
		
		System.out.println(Option1.getTagName());
		
		System.out.println(Option1.isSelected());
		
	
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Option 3']")).click();
		
		
		
		
		
		
		
	}

}
