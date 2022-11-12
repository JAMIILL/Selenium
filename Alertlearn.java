package SeleniumClassrooms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertlearn {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        driver.switchTo().alert().sendKeys("SNAKE");//or   Alert alert = driver.switchTo().alert();
                                                    //      alert.sendKeys("SNAKE");
                                                    //       alert.accept();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
         String text = driver.switchTo().alert(). getText();                           
         System.out.println(text);
         driver.switchTo().alert().accept();
	}

}
