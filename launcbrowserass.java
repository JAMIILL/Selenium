package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.ByteProcessor.IndexNotOfProcessor;

public class launcbrowserass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasanth");
		driver.findElement(By.name("birthDate")).sendKeys("14/11/1999");
		
		
		WebElement eleDropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(eleDropDown1);
		dd1.selectByVisibleText("Employee");

		WebElement eleDropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(eleDropDown2);
		dd2.selectByIndex(2);
		
		
		WebElement eleDropDown5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd5 = new Select(eleDropDown5);
		dd5.selectByVisibleText("India");
		
	 
		

	}}