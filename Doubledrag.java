package Week5Day5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Doubledrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("http://www.leafground.com/pages/drop.html");
		 driver.manage().window().maximize();
		 
  WebElement findElement1 = driver.findElement(By .id("droppable"));	
  WebElement findElement = driver.findElement(By .id("draggable"));
  Actions build = new Actions(driver);
  build.dragAndDrop(findElement,findElement1).perform();

	}

}
