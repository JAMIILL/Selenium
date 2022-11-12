package Week5Day5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		
		//switchTo frame
		WebElement element2 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(element2);
		
		//Actions
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se')]"));
		Actions drag=new Actions(driver);
		drag.dragAndDropBy(element, 15,20).release().perform();
	

	}

}
