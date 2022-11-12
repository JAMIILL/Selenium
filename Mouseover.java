package WORK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.findElement(By.xpath("//button[@class= '_2KpZ6l _2doB4z']")).click();
        WebElement element = driver.findElement(By.xpath("//div [text()='Fashion']"));
        Actions builder=new Actions(driver);   
        builder.moveToElement(element).perform();
        driver.findElement(By.linkText("Men's Top Wear")).click();

	}

}
