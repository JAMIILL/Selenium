package WORK;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Link {


	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		 
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		
		//use navigate for reference
		driver.navigate().back();
		
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
	//going to check the page titles are Equal
		String Title = driver.getTitle();
		System.out.println("GET TITLE" + Title ); // what if put directly (driver.getTitle) in sysout
		driver.findElement(By.linkText("Verify am I broken?")).click();
        String Title1 =driver.getTitle(); 
		System.out.println(Title1);   // is there an any other way to do put "directly (driver.getTitle) in sysout" here also & compare directly in if
//
//		String title= driver.getTitle(); // ask why they didnt do like the above one
//		String pageTitle="404 Not Found";
//		driver.findElement(By.linkText("Verify am I broken?")).click();
	
		if(Title.equals(Title1)) {
			System.out.println("image is broken");
			
		}
		
		
        driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		//Going to convert it into list for get size by using get method
		 java.util.List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("numberof links are:"+elements.size());
	}}
		
