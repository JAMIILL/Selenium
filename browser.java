package selenium;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class browser {
		
		public static void main(String[] args) {
			//download the driver and set the path
			WebDriverManager.chromedriver().setup();
			//launch the browser
			ChromeDriver driver=new ChromeDriver();
			//load the apps url
			driver.get("http://leaftaps.com/opentaps/control/main");
			//max the browser
			driver.manage().window().maximize();
			
			 
			WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
			select obj=new select(element);//select = class
			obj.selectByValue("LEAD_EXISTCUST");
			//find the first dropdown by clicking inspect
			webelement eledropdown1 = driver.findElement(by.id("dropdown"));//webele = interface
			//convert to select class
			select dd1 = new select(eledropdown);
			//we can select by 3 types
			selectbyvalue = numbers
			//selectbyindex = by calling index with numbers (i.e = index 1 , but index starts with 0)
			//dd1.selectbyindex(1)
			//dd1.selectbyvisibletext("appium")
		    //dd1.selectbyvalue("2")
			
			driver.findElement(By.xpath("createLeadForm_companyName"))
			