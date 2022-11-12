package Week3day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> NewWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(NewWindow.get(1));
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gopin9353@gmail.com");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		//get the number of window
		WebElement num = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		num.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2.size());
//		List<String> mul=new ArrayList<String>(windowHandles2);
//		driver.switchTo().window(mul.get(1));
//		driver.manage().window().maximize();
//		//driver.close();
//		driver.switchTo().window(mul.get(2));
//		driver.manage().window().maximize();
//		//driver.close();
		//driver.switchTo().window(parentwindow);
		
		//close all window expect parent window
		
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> gopi=new ArrayList<String>(windowHandles3);
//		driver.switchTo().window(close.get(1));
//		driver.manage().window().maximize();
//		driver.switchTo().window(close.get(2));
//		driver.manage().window().maximize();
		for (int i = 1; i < windowHandles3.size(); i++) {
			driver.switchTo().window(gopi.get(i));
			if(!parentwindow.equals(gopi))
				driver.close();
			
		}
		
//		for (String string : windowHandles3) {
//			
//			if(!parentwindow.equals(string)) {
//				driver.switchTo().window(string);
//				driver.close();
//				
//			}
//		}
		
		driver.switchTo().window(parentwindow);
		WebElement abc = driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']"));
		abc.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> open=new ArrayList<String>(windowHandles4);
		driver.switchTo().window(open.get(2));
		driver.manage().window().maximize();
		
	}}