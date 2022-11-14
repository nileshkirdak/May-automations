package datepicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DatePickerInSelenium t=new DatePickerInSelenium();
		t.setup();
		t.test_date_picker();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
	}
	
	public void test_date_picker() throws InterruptedException
	{
		WebElement click_calendar=driver.findElement(By.id("datePickerMonthYearInput"));
		click_calendar.click();
		Thread.sleep(3000);
		
		WebElement sel_year=driver.findElement(By.className("react-datepicker__year-select"));
		Select select_year=new Select(sel_year);
		
		Thread.sleep(3000);
		select_year.selectByValue("1953");
		
		WebElement sel_month=driver.findElement(By.className("react-datepicker__month-select"));
		Select select_month=new Select(sel_month);
		
		Thread.sleep(3000);
		select_month.selectByVisibleText("August");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, August 19th, 1953']")).click();
		
	}


}
