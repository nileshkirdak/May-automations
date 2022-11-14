package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice8 {

	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Practice8 p8 =new Practice8();
		p8.setup();
		p8.test_broken_links();
		
	}

	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
	}
	
	public void test_broken_links() throws IOException, InterruptedException {
	
		Thread.sleep(5000);
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
	
	System.out.println(all_links.size());
	
	for(int i = 0;i<=all_links.size();i++)
	{
		WebElement element = all_links.get(i);
		
		String url = element.getAttribute("href");
		
		URL link =new URL(url);
		
		HttpURLConnection url_conn =(HttpURLConnection) link.openConnection();
		url_conn.connect();
		
		Thread.sleep(3000);
		int resp_code = url_conn.getResponseCode();
		
		if(resp_code>=400)
		{
			
			System.out.println(url+":  Broken link");
			
		}
		
		else 
		{
			System.out.println(url+":  link is valid");
		}
		
	}
	

	}
	
}
