package SeleniumClassrooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); //"C"hrome"D"river = caps =default
		 driver.get("http://www.leafground.com/pages/appear.html");
		 driver.manage().window().maximize();
	
 
		 WebElement ele = driver.findElement(By.id("btn"));// ===>"//button[contains(@onclick,'clicked')]"
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			System.out.println(ele.isDisplayed()); //used to show whether it is displayed or not
			
		 
		 
	}

}
