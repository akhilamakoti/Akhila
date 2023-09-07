package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_byrobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		Robot aa=new Robot();
		
		aa.keyPress(KeyEvent.VK_PAGE_DOWN);
		aa.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		aa.keyPress(KeyEvent.VK_PAGE_UP);
		aa.keyRelease(KeyEvent.VK_PAGE_UP);
		
		

	}

}
