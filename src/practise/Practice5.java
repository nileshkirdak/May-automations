package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {

	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Practice5 p5=new Practice5();
		p5.setup();
		
		
	}

	
	public void setup() throws IOException {
		
		path=System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		file_path=path+"\\Resource\\Test.Properties";
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		File f=new File(file_path);
		
		FileInputStream fin= new FileInputStream(f);
		
		Properties p= new Properties();
		p.load(fin);
		
		String base_url=p.getProperty("url");
		driver.get(base_url);
		
		
	}
}
