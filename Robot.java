package Week1SeleniumAssignments;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver(); 
		 driver.get("https://www.edureka.co");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.findElement(By.linkText("Courses")).click();
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 System.out.println("a");
		 robot.keyPress(KeyEvent.VK_TAB);
		 System.out.println("b");
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.mouseMove(30,100);		 
		 
		 

	}

	private void mouseMove(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void keyPress(int vkDown) {
		// TODO Auto-generated method stub
		
	}

}
