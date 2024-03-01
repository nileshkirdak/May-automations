package actionsclassinselenium;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassInSelenium {

	WebDriver driver;
	String path= "";
	String actual_path="";
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ActionsClassInSelenium ac =new ActionsClassInSelenium();
		ac.setup();
		ac.test_action();
		ac.test_drag_drop();
	}

	
	public void setup() {
		
		path= System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
	
	}
	
	public void test_action() throws InterruptedException {
		
		
		WebElement single_click =driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		
		Actions a =new Actions(driver);
		Thread.sleep(3000);
		Action act =a.moveToElement(single_click).click().build();
		act.perform();
		WebElement right_click = driver.findElement(By.id("rightClickBtn"));
		
		Thread.sleep(3000);
		a.moveToElement(right_click).contextClick().build().perform();
		
		WebElement double_click =driver.findElement(By.id("doubleClickBtn"));
		
		Thread.sleep(3000);
		a.moveToElement(double_click).doubleClick().build().perform();
		
	}
	
	public void test_drag_drop() throws InterruptedException {
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Actions a1 =new Actions(driver); 
		
		
		WebElement drag_bank= driver.findElement(By.id("credit2"));
		WebElement drop_bank= driver.findElement(By.id("bank"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_bank, drop_bank).build().perform();
		
		
		
		WebElement drag_amount=driver.findElement(By.id("fourth"));
		WebElement drop_amount=driver.findElement(By.id("amt7"));
		Thread.sleep(3000);	
		a1.dragAndDrop(drag_amount, drop_amount).build().perform();
		
		
		
		WebElement drag_sales =driver.findElement(By.id("credit1"));
		WebElement drop_sales= driver.findElement(By.id("loan"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_sales, drop_sales).build().perform();
		
		
		
		
		WebElement drog_credit_amount =driver.findElement(By.id("fourth"));
		WebElement drop_credit_amount =driver.findElement(By.id("amt8"));
		Thread.sleep(3000);
		a1.dragAndDrop(drog_credit_amount, drop_credit_amount).build().perform();
		
	
	}
	
}
