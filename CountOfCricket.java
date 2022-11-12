package WORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfCricket {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cricket",Keys.ENTER);
		 List<WebElement> iz = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(iz.size());
	}

}
