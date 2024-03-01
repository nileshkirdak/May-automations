package project_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import broken_links.Broken_links;
import dev.failsafe.internal.util.Assert;

public class Guru99 {

	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Guru99 b =new Guru99();
		b.setup();
		b.login();
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/index.php");
	}
	
	public void login () throws IOException
	{
		String path =System.getProperty("user.dir");
		String actual_path = path +"\\Resource\\Test.Properties";
		
		
		File f = new File(actual_path);
		
		FileInputStream fin = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fin);
		String email =p.getProperty("username");
		String pass = p.getProperty("pass");
		
		driver.findElement(By.name("uid")).sendKeys(email);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();
		
			
		
		
	}

}
