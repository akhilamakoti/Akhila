package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mini {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();.
	    driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	driver.close();
	}
	}

