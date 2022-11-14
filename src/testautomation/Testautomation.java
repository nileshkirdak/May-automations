package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testautomation {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  
		  WebElement tagh2= driver.findElement(By.tagName("h2"));
		  System.out.println(tagh2.getText());
		  
		  
		  WebElement email =driver.findElement(By.id("email"));
		  
		  
		  email.sendKeys("9850789816");
		  
		  
		  WebElement pass =driver.findElement(By.id("pass"));
		  
		  pass.sendKeys("Nilesh");
		  
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
	      WebElement a2= driver.findElement(By.partialLinkText("Forgotten"));
	      
	      a2.click();
		 
		
		//  WebElement login =driver.findElement(By.name("login"));
		 // login.click();
		  //driver.findElement(By.name("login")).click();
		  
		 
	}

}
