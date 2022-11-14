package alertsInSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsInSelenium {


	WebDriver driver;
	String path="";
	String actual_path ="";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AlertsInSelenium al=new AlertsInSelenium();
		
		al.setup();
		al.alerts();
	}

	public void setup () {
		
        path=System.getProperty("user.dir");
		
		actual_path = path+"\\chrome_driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	public void alerts() throws InterruptedException {
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
				
		WebElement time =driver.findElement(By.id("timerAlertButton"));

		time.click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));

		w.until(ExpectedConditions.alertIsPresent());
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		
		Thread.sleep(3000);
		alt.accept();
		
		WebElement confirm =driver.findElement(By.id("confirmButton"));
		Thread.sleep(3000);
		confirm.click();
		
		alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();		
		WebElement promt_Button =driver.findElement(By.id("promtButton"));
		
		Thread.sleep(3000);
		promt_Button.click();
		alt= driver.switchTo().alert();
		alt.sendKeys("I Am Nilesh");
		
		Thread.sleep(3000);
		alt.accept();
		
	}
}
