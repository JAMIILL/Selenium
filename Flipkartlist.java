package WORK;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartlist {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.findElement(By.xpath("//button[@class= '_2KpZ6l _2doB4z']")).click();
        WebElement element = driver.findElement(By.xpath("//div [text()='Fashion']"));
        Actions builder=new Actions(driver);   
        builder.moveToElement(element).perform();
//   driver.findElement(By.linkText("Men's Top Wear")).click();// why i cant choose the near by mens tshirt.
//   driver.findElement(By.xpath("//a[@class ='_2SqgSY'][2]")).click();
 
   

//	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_1YAKP4']/select"));
//   for(int i=0;i<findElements.size();i++)
//   {
//	   String s = findElements.get(i).getText();
//	  System.out.println(s);
//   }
   driver.findElement(By.xpath("//a[@class ='_6WOcW9 _3YpNQe'][2]")).click();
	List<WebElement> findElements1 = driver.findElements(By.xpath(" //div[@class='_30jeq3']"));
  for(int i=0;i<findElements1.size();i++)
  {
	   String s1 = findElements1.get(i).getText();
	  System.out.println("T shirt price" +s1);
	}


	}
}
