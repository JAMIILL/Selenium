package SeleniumClassrooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameLetCode {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
       // driver.get("https://letcode.in/frame");
        driver.get("http://www.leafground.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        
        WebElement findElement = driver.findElement(By.xpath("//li[@id = 'menuform:j_idt39']/a"));
   
        Actions builder = new Actions(driver);
        builder.moveToElement(findElement).click().perform();
	
	}

	private static By ByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
