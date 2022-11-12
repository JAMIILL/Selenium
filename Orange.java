package WORK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		
		 
	}

}
