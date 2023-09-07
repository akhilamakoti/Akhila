package akhila;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Robot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	     Robot r=new Robot();
	   r.Keypress(KeyEvent.VK_PAGE_DOWN);
	   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   Thread.sleep(5000);
	   r.Keypress(KeyEvent.VK_PAGE_UP);
	   r.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	void Keypress(int vkPageUp) {
		// TODO Auto-generated method stub
	}
	void keyRelease(int vkPageUp) {
		// TODO Auto-generated method stub
		
	}

}
