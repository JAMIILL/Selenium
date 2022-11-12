package WORK;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.sun.org.apache.bcel.internal.generic.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContacts {
	  public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); //"C"hrome"D"river = caps =default
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");//send"k"eys = caps
		 driver.findElement(By.className("decorativeSubmit")).click();//class "N"ame = caps
		 String text =driver.findElement(By.tagName("h2")).getText();//get"T"ext
		 System.out.println(text);
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 driver.findElement(By.xpath("//a[contains(@id,'ext-gen298')]")).click();
		 
		 
		 
		 

}
}