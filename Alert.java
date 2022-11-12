package WORK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		
		//Accept
		driver.findElement(By.id("accept")).click();
		org.openqa.selenium.Alert accept = driver.switchTo().alert();
		accept.accept();
//		String text = accept.getText(); //ref
//	    System.out.println(text);
	    
	    //conformation =  Dismiss 
	    driver.findElement(By.id("confirm")).click();
		org.openqa.selenium.Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		
		//prompt
		 driver.findElement(By.id("prompt")).click();
		org.openqa.selenium.Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("jameel");
		prompt.accept();
		
		//Sweet (Asusal)
		driver.findElement(By.id("modern")).click();
		driver.findElement(By.className("modal-close is-large")).click();
	}

}
