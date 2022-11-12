package Week5Day5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaExcecutorcroll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("https://www.facebook.com");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement scroll = driver.findElement(By.xpath("//div[text()='TestNG']"));
        js.executeScript("arguments[0].click()",scroll);

	}

}
