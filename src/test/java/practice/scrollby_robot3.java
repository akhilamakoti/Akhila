
package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby_robot3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.ltmetro.com/");	
Robot ab=new Robot();

ab.keyPress(KeyEvent.VK_PAGE_DOWN);
ab.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(5000);
ab.keyPress(KeyEvent.VK_PAGE_UP);
ab.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
