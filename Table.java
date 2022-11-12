package WORK;


		import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import com.sun.org.apache.bcel.internal.generic.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;
		public class Table {

			

			public static void main(String[] args) {

	
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver =new ChromeDriver(); //"C"hrome"D"river = caps =default
			 driver.get("https://erail.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 driver.findElement(By.id("txtStationFrom")).clear();
			 driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
			 
//			 WebElement find = driver.findElement(By.id("txtStationFrom")); // because for reusability
//			 find.clear();
//			 find.sendKeys("MAS",Keys.ENTER);
			 
			 driver.findElement(By.id("txtStationTo")).clear();
			 driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
			
			 driver.findElement(By.id("chkSelectDateOnly")).click();
			 
			 // why we use list bcus, here we using findElementS  why we are going to do lot of elements 
			 List<WebElement> Elements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
			 
			 //find the length for for conditions
			 int size =  Elements.size();
			 
			 //why do we create a empty list here ,bcus print value in a order by add method in for & collections.sort;
			  List<String> name =new ArrayList<String>();
			  System.out.println("size" + size );
			  
			  for (int i =0; i<size;i++)
			  {
				  String  text = Elements.get(i).getText();
				 // System.out.println(text);
				  name.add(text); //adding the values in list i "add.()"  ===add here for the name here for loop
			  }
//			  Collections.sort(name);
//
//			  System.out.println(name);
			  }
			
		
			}

