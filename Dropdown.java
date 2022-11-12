package WORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("fruits"));
		Select drop1 = new Select(findElement);
		drop1.selectByIndex(2);
		
//to know the selected value in console
		WebElement firstSelectedOption = drop1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

//to know it is multiselectable or not		
		WebElement findElement2 = driver.findElement(By.id("superheros"));
		Select drop2 = new Select(findElement2);
				
		boolean multiple = drop2.isMultiple();
		System.out.println(multiple);
		
//to know the multiselectable value selected in the dropdown
		drop2.selectByVisibleText("Aquaman");
		drop2.selectByVisibleText("Batman");
		drop2.selectByVisibleText("Batwoman");	

		List<WebElement> allSelectedOptions = drop2.getAllSelectedOptions();
		  for(int i=0;i<allSelectedOptions.size();i++)
		  {
			   String s1 = allSelectedOptions.get(i).getText();
			  System.out.println("values" + s1);
			}

//to know all valuesin the dropdown
		  List<WebElement> options = drop2.getOptions();
		  for(int i=0;i<options.size();i++)
		  {
			   String s2= options.get(i).getText();
			  System.out.println("values" + s2);
			}
		  
//to deselect the dropdown
		  drop2.deselectByVisibleText("Batman");
		
	}

}
