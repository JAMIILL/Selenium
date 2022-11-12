package Week3day2Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.runtime.Runtime.Builder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {


public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver =new ChromeDriver(); 
	 driver.get("https://www.nykaa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	    WebElement element=driver.findElement(By.xpath("//a[text()='brands']"));
	    Actions builder=new Actions(driver);
	  builder.moveToElement(element).clickAndHold().perform();
	 
     //builder.moveToElement(element).perform();
//      driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
//      driver.findElement(By.linkText("L'Oreal Paris")).click();
//      System.out.println(driver.getTitle());
      
}}