package selectoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {


	WebDriver driver;
	String path="";
	String actual_path ="";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SelectOption sel = new SelectOption();
		
		sel.setup();
		sel.dropdown();
	
		
	}
	
    
	public void setup() {
		
		path=System.getProperty("user.dir");
		
		actual_path = path+"\\chrome_driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
	}
	
	public void dropdown() throws InterruptedException {
		
		WebElement selectoption = driver.findElement(By.id("fruits"));
		
		Select s=new Select(selectoption);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("apple");
		
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Grape");
	}
}
