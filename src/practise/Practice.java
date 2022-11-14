package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Practice n=new Practice();
		n.setup();
	
		
	}

	public void setup() throws IOException, InterruptedException {
		
		path=System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		file_path=path+"\\Resource\\Test.Properties";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		File f =new File(file_path);
		
		FileInputStream fin =new FileInputStream(f);
		
		Properties p=new Properties();
		p.load(fin);
		
		String base_url=p.getProperty("url");
		
		driver.get(base_url);
		
		String id=p.getProperty("username");
		
	     driver.findElement(By.id("email")).sendKeys(id);
	     String password =p.getProperty("pass");
	     Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
	

		
	}
	
}
