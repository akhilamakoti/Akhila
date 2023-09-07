package akhila;

import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Robot r=new Robot();
		 r.Keypress(KeyEvent.VK_PAGE_DOWN);
		   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		   Thread.sleep(4000);
		   r.Keypress(KeyEvent.VK_PAGE_UP);
		   r.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		

	}



