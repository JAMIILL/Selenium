package WORK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nointernetconnection {

	static ChromeDriver driver ; 
	public static void main(String[] args) {
		
		
		try {
			
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		}
		 
		catch(Exception e)
		{
		 String findElement = driver.findElement(By.xpath("//div[@id='main-message']//span")).getText();
		 System.out.println(findElement);
		}

		 
		

	}

}
