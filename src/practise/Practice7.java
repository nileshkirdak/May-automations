package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice7 {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Practice7 p7=new Practice7();
		p7.setup();
		p7.test_file_upload();

		
		
	}
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
	
	}
	public void test_file_upload() throws AWTException, InterruptedException {
		WebElement uploadfile =driver.findElement(By.id("uploadfile_0"));
		
		Actions a=new Actions(driver);
		a.moveToElement(uploadfile).click().build().perform();
		
		//String file_path = path+"test case templet.xlsx";
		String file_path = "C:\\Users\\admin\\Desktop\\test case templet.xlsx";
		
		StringSelection str=new StringSelection(file_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot r =new Robot ();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		  driver.findElement(By.id("terms")).click(); Thread.sleep(3000);
		  
		  driver.findElement(By.id("submitbutton")).click();
		 
		
	}

}
