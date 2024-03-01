package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 {

	WebDriver driver;
	String path= "";
	String actual_path="";
	String file_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public void setup () {

		// path=System.getProperty("user.dir");
		// actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		// file_path=path+"\\Resource\\Test.Properties";
		
		// System.setProperty("webdriver.chrome.driver", actual_path );
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32");
 
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
}
