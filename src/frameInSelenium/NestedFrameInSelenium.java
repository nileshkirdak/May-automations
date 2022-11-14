package frameInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedFrameInSelenium n =new NestedFrameInSelenium();
		n.setup();
		n.test_frame();
	}


	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		
	}
	
	public void test_frame() {
		
		WebElement parent_frame =driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(parent_frame);
		
		WebElement child_frame=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(child_frame);
		
		WebElement p_tag =driver.findElement(By.xpath("//p [contains(text(),'Child Iframe')]"));
		
		System.out.println(p_tag.getText());
		
		driver.switchTo().defaultContent();

		
		
		
	}
	
	
}
