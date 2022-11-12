package Week5Day5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaExcecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("https://www.facebook.com");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Create a reference 
        JavascriptExecutor js =(JavascriptExecutor)driver;
        
        //enter values like endkeys
        WebElement username = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].setAttribute('value','jameel')",username);
	    
        //get values like getattribute
        Object obj = js.executeScript("return arguments[0].getAttribute('value')",username);
	    String s1 =(String)obj;
	    System.out.println(s1);
	    
        WebElement password = driver.findElement(By.id("pass"));
        js.executeScript("arguments[0].setAttribute('value','12345')",password);
	
	    //click the button
//	    WebElement click = driver.findElement(By.id("login"));
//        js.executeScript("arguments[0].click()",click);
     
        WebElement click1 = driver.findElement(By.linkText("Forgotten password?"));
       js.executeScript("arguments[0].click();",click1);
       //   js.executeScript("arguments[0].scrollintoView(false)",click1);
         // js.executeScript("arguments[0].scrollintoView(true)",click1);
	}
}
