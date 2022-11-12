package Week3day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaf2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("jameel");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("salem");
		boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		System.out.println("Enabled"+enabled);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String attribute = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("hi",Keys.TAB);
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("hafadfdafi");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		boolean enabled1 = driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']")).isDisplayed();
		System.out.println("Enabled1"+enabled1);
		Point location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println(location);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		Point location1 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println(location1);
		if(location != location1);
		System.out.println("ok");
		//driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']/ul")).sendKeys("hi");
		WebElement search = driver.findElement(By.xpath("//div[@role='application']//ul"));
		search.click();
		//search.sendKeys("123");
		
//		WebElement text = driver.findElement(By.xpath("//div[@role='application']//ul"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='1234'",search );
		 WebElement element=driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
		    Actions builder=new Actions(driver);
		    //builder.moveToElement(element).perform();
		    builder.moveToElement(element).clickAndHold().perform();
		    driver.findElement(By.xpath("//a[text()='17']")).click();
		    driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("12345");
		    driver.findElement(By.xpath("//span[@class='ui-button-text']//span")).click();
		    driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		    driver.findElement(By.id("menuform:j_idt38")).click();
		    
		    WebElement findElement = driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']"));
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(findElement).click().perform();
		    
		    WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
		    Select obj = new Select (dropdown);
		    obj.getFirstSelectedOption();

		
		
	}

}
