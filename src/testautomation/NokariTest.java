package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NokariTest extends Testautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=CjwKCAjw7p6aBhBiEiwA83fGum8vu4kt6qrIluPf72PDskvM_guCt0cjmQObp7x42cfOsQfjumVA0RoCfGkQAvD_BwE&gclsrc=aw.ds");
		
		
		WebElement name =driver.findElement(By.id("name"));
		
		name.click();
		
		name.sendKeys("Nilesh Kirdak");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.click();
		
		email.sendKeys("nilesh@gmai.com");
		
		WebElement password= driver.findElement(By.id("password"));
		
		password.click();
		
		password.sendKeys("123456");
		
	
		WebElement mobile=driver.findElement(By.id("mobile"));
		
		mobile.click();
		mobile.sendKeys("9915575124");
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement email1 =driver.findElement(By.id("email"));
		
		email1.sendKeys("nilesh@gmail.com");
		
     	
	//	a2.findElement(By.partialLinkText("Forgotten"));
	}

}
