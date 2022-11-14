package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTableInSelenium wt=new WebTableInSelenium();
		wt.setup();
		wt.test_table();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	}
	
	public void test_table() 
	{
		List<WebElement> complete_table = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		for(WebElement x:complete_table)
		{
			String company_name=x.findElement(By.xpath("td[1]")).getText();
			
			if(company_name.contains("Ltd"))
			{	
				String current_price=x.findElement(By.xpath("td[4]")).getText();
				System.out.println(company_name+" - "+current_price);
			}
		}
	}

}
