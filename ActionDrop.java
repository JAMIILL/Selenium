package Week5Day5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDrop {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); //"C"hrome"D"river = caps =default
		 driver.get("http://www.leafground.com/pages/drag.html");
		 driver.manage().window().maximize();
		 
		 
   WebElement findElement = driver.findElement(By .id("draggable"));
   Actions build = new Actions(driver);
   build.dragAndDropBy(findElement, 100, 120).perform();
	}

}
