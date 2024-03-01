package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {

	WebDriver driver;
	String path= "";
	String actual_path="";
	String file_path="";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Practice1 p1=new Practice1();
		p1.setup();

		p1.radio();
		
	}

	public void setup () throws IOException {
		
		path=System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		file_path=path+"\\Resource\\Test.Properties";
		
		System.setProperty("webdriver.chrome.driver", actual_path );
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		File f=new File(file_path);
		FileInputStream fin =new FileInputStream(f);


		Properties p =new Properties();
		p.load(fin);

		String base_url=p.getProperty("url");


		driver.navigate().to(base_url);
	
	}
	
	public void radio() throws InterruptedException {
		
		Thread.sleep(3000);
		
		
	    driver.findElement(By.id("yes")).click();
	    
	    
	    
			
			  WebElement bu =driver.findElement(By.id("buttoncheck")); Thread.sleep(3000);
			  bu.click();
			  
			  System.out.println(bu.getText());
			  
			  System.out.println(driver.getTitle());
			  
			  Thread.sleep(3000);
			  
			  driver.findElement(By.id("no")).click();
			  
			  Thread.sleep(3000); bu.click(); Thread.sleep(3000);
			  driver.findElement(By.xpath("//input[@value='Reset']")).click();
			 
		
		
	}
	
}
