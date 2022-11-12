package WORK;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[contains(text(),'home')]/following-sibling::img")).click();
		
		driver.navigate().back();
		driver.findElement(By.xpath("//label[contains(text(),'Broken')]/following-sibling::img")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String pageTitle="TestLeaf - Interact with Images";
		System.out.println(pageTitle);
		if(title.equals(pageTitle)) {
			System.out.println("the image is broken");
		}
		
		// what is this???
			driver.switchTo().activeElement().findElement(By.xpath("//label[contains(text(),'Keyboard')]/following-sibling::img")).click();
		
	}

}
