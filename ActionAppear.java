package Week5Day5Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionAppear {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.get("http://www.leafground.com/pages/appear.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	        WebElement Ele= driver.findElement(By.id("btn"));


	        //Take Snapshot
	        File source = driver.getScreenshotAs(OutputType.FILE);
	        File Destination=new File("./snap/img.png");
	        FileUtils.copyFile(source, Destination);
	        

	}

}
