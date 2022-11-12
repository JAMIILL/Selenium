package Week5Day5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/selectable.html");
	driver.manage().window().maximize();
	 
	//store Items
	 WebElement findElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
	  WebElement findElement1 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	  WebElement findElemente2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	  WebElement findElement3 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	 
	//Select required
	Actions builder=new Actions(driver);
	builder.clickAndHold(findElement).clickAndHold(findElement1).clickAndHold(findElemente2).clickAndHold(findElement3).perform();
	
}
}
