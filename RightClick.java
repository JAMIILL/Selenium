package Week5Day5Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(elementLocator).perform();
		
		Actions act =new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(findElement).perform();
		driver.switchTo().alert().accept();

	}

}
