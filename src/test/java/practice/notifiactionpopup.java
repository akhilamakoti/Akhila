package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notifiactionpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.hdfc.com");
		FirefoxOptions c=new FirefoxOptions();
		WebDriver d=new FirefoxDriver(c);
		c.addArguments("disable-notifiactions");
		c.addArguments("start-maximized");
		
		
	}

}
