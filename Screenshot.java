package WORK;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 //take screenshot the whole dom
		 File snapshot  =driver.getScreenshotAs(OutputType.FILE);//Capture screenshot
		 File folder = new File("./snap/img.png");
		 FileUtils.copyFile(snapshot, folder); // save to disk
		 
		 //take the particular part 
		 WebElement findElement0 = driver.findElement(By.xpath("//form[@id='login']"));
		 File Form  =findElement0.getScreenshotAs(OutputType.FILE);
		 File folder0 = new File("./snap/img22.png");
		 FileUtils.copyFile(Form, folder0);
		 
		 //take screenshot the particular webelement
		 WebElement findElement = driver.findElement(By.xpath("//form[@id='login']//p"));
		 File Username  =findElement.getScreenshotAs(OutputType.FILE);
		 File folder1 = new File("./snap/img3.png");
		 FileUtils.copyFile(Username, folder1);
		 
		
		 
		 
		 
		 
	}

}
