package selectoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption1 {


	WebDriver driver;
	String path="";
	String actual_path ="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SelectOption1 sel = new SelectOption1();
		
		sel.setup();
		sel.dropdown();
	}

	public void setup() {
		
		path=System.getProperty("user.dir");
		
		actual_path = path+"\\chrome_driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	public void dropdown() {
		
		WebElement selectoption= driver.findElement(By.name("country"));
		
		Select s=new Select(selectoption);
		
		s.selectByValue("BRAZIL");
	}
	
	
}
