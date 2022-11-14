package fileupload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	WebDriver driver;
	String path="";
	String actual_path="";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Fileupload f=new Fileupload();
		f.setup();
		f.test_file_upload();

	}

	public void setup() {
		path=System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
	}
	public void test_file_upload() throws InterruptedException {
	    driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\admin\\Desktop\\test case templet.xlsx");
		Thread.sleep(3000);
		
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("submitbutton")).click();
	
	}
	
	
	
}
