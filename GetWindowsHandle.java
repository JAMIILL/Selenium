package Week5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowsHandle {

	public static void main(String[] args) {

		//download the driver and set the path
			WebDriverManager.chromedriver().setup();
			//launch the browser
			ChromeDriver driver=new ChromeDriver();
			//load the application url
			driver.get("https://www.google.com/search?q=diff+between+test+metrices+and+rtm+&rlz=1C1CHBF_enIN1006IN1006&sxsrf=ALiCzsYGXMDYDxYAVhFUwhLYDSuwsFsfQQ%3A1662880533858&ei=FYsdY8aCNKrD4-EPwtulyAo&ved=0ahUKEwiG4ZjcmIz6AhWq4TgGHcJtCakQ4dUDCA4&uact=5&oq=diff+between+test+metrices+and+rtm+&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEB4QogQyBQgAEKIEMgUIABCiBDIFCAAQogQ6BwgjEOoCECc6DQguEMcBENEDEOoCECc6BAgjECc6BAgAEEM6CwgAEIAEELEDEIMBOgoIABCxAxCDARBDOgcIABCxAxBDOgcILhCxAxBDOgoIABCABBCHAhAUOggIABCABBCxAzoLCC4QsQMQxwEQ0QM6EQguEIAEELEDEIMBEMcBENEDOgUIABCABDoHCAAQgAQQCjoOCC4QgAQQsQMQxwEQ0QM6CgguEIAEENQCEAo6BAgAEAo6BQgAELEDOhAILhCxAxCDARDHARCvARAKOgcIABCxAxAKOgYIABAKECo6BwguENQCEAo6BAguEAo6CgguELEDENQCEEM6DgguEIAEELEDEIMBENQCOgUIABCRAjoRCC4QgAQQsQMQgwEQxwEQrwE6CggAEIAEEEYQ-QE6CgguEMcBEK8BEAo6CwguEIAEEMcBEK8BOgoIABCABBCxAxAKOgYIABAeEBY6CAgAEB4QFhAKOgUIABCGAzoHCCEQoAEQCjoICCEQHhAWEB06BAghEBU6BggAEB4QDToGCCEQChAVOgoIIRAeEBYQChAdOgQIIRAKSgQIQRgASgQIRhgAUMUFWLy5AmCuvgJoCHAAeAGAAfkCiAGnPJIBCDAuNDAuNS4xmAEAoAEBsAEKwAEB&sclient=gws-wiz");
			//maximize the browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//getWindowHandle() --current or parent window 
			//getWindowHandles()-- child window
			
			
// get the first window by using getWindowHandle for make a main window;
			String parentWindow = driver.getWindowHandle(); 
		
			
 // then put the location to click as usual & we dont know how many windows or tabs are going to open.
			driver.findElement(By.id("home")).click(); 
// so use we using (getWindowHandleS)==>ctl+2L+==>it automatically return value in SET.but the problem is SET doesn't has GETmethod,because it has diff impl class tree,has,link.
			 Set<String> windowHandles = driver.getWindowHandles();
				
//so based on dif impl it cant maintain insertion order.so.we have to convert SET into LISt.			
			List<String> openWindow=new ArrayList<String>(windowHandles);
			
//By using this keyword we can go to the window which one we want by giving index value
			driver.switchTo().window(openWindow.get(1));	 
	
//now we are going to verify the window by compare the titles of the page    
			driver.findElement(By.xpath("//h5[text()='Edit']")).click();   
			
// take the title of the page by manually typing			
			  String title="TestLeaf - Interact with Edit Fields";
			  
// get the real title of the page 		  
			  String title2 = driver.getTitle(); 
			  
//now compare the two titles by using IF 
			  if(title.equals(title2)) { 
			  System.out.println("Switched to another window"); 
			   }else { 
			  System.out.println("Controll not switched"); 
			  }
			  
// it closes only the current page because control is only in that. 
			  driver.close();
			  
// now go to first page means parent window.(question will rise why we give switch to parent win because already the child window closed,but in this browser only 1 child page has opened but if it opened lot of pages open it will close only last page)
			  driver.switchTo().window(parentWindow);
			  
// How to find the size of the browser(windows opened)
			  driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();//asusal
			  int size = driver.getWindowHandles().size();
			  
		 System.out.println("size"+size);

	}

}
