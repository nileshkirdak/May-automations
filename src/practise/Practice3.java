package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Practice3 {


	WebDriver driver;
	String path="";
	String actual_path ="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice3 p3=new Practice3();
		p3.setup();
		
		p3.select1();
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		
	}
	
	public void select1() {
		
		WebElement n =driver.findElement(By.id("fruits"));
		
		
		Select s=new Select(n);
		
		
		s.selectByValue("apple");
		
		System.out.println(driver.getTitle());
		
		s.selectByValue("orange");
		
	}
	
	
}
