package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {


	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice4 p4=new Practice4();
		p4.setup();
		
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("");
		
		
	
	
	
	
		
	
	}
}
