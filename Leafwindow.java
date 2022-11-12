package Week3day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.hash.HashCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.HashCodeMethod;

public class Leafwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		
		String parentWindow = driver.getWindowHandle(); //Mandatory to set a parent window 1st.
		
		  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span")).click(); 
         Set<String> windowHandles = driver.getWindowHandles();
         List<String> OPen = new ArrayList<String>(windowHandles);
         driver.switchTo().window(OPen.get(1));
         String title = driver.getTitle();
         String title1 = "Dashboard";
         System.out.println(title);
         if(title.equals(title1))
        {
        	 System.out.println("yes");
         }
         driver.close();
         
         driver.switchTo().window(parentWindow);
         driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
         Set<String> windowHandles1 = driver.getWindowHandles();
         List<String> OPen1 = new ArrayList<String>(windowHandles1);
         driver.switchTo().window(OPen1.get(2)).close();
         driver.switchTo().window(OPen1.get(3)).close();
         driver.switchTo().window(OPen1.get(1)).close();
         driver.close();
         
         driver.switchTo().window(parentWindow);
         driver.findElement(By.id("j_idt88:j_idt91")).click();
         int size = driver.getWindowHandles().size();
         System.out.println(size);
	}

}
