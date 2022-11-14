package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioandcheckbox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\May automations\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		Thread.sleep(3000);
		checkbox1.click();
		
		System.out.println(driver.getTitle());
		System.out.println(checkbox1.getText());
		System.out.println(checkbox1.getAttribute("type"));
		System.out.println(checkbox1.getTagName());
		System.out.println(checkbox1.isSelected());
		
		
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		Thread.sleep(3000);
		checkbox2.click();
		
		
		WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
		Thread.sleep(3000);
		checkbox3.click();
		
		
		
		
	}

}
