package WORK;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameW3school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
//        driver.switchTo().alert().sendKeys("jam"); //(why dont we use straightly sendkeys here)
//        driver.switchTo().alert().accept();
 		Alert alert = driver.switchTo().alert();//(why do we create a local variable here bcus we r going to do more than 1 task by creating 1 webelement)
     	alert.sendKeys("TestLeaf");
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}

}
