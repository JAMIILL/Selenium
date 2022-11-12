package Week5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("https://erail.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.id("txtStationFrom")).clear();
		 driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		 driver.findElement(By.id("buttonFromTo")).click();
		 List<WebElement> Elements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		  int size =  Elements.size();
		  for (int i=1;i<= size;i++)
		  {
		String text1= driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		
		System.out.println(text1);

	}

	}}
