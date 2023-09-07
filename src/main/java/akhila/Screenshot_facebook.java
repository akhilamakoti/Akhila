package akhila;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
		 driver.get("https://www.facebook.com/");
		 TakesScreenshot ts=(TakesScreenshot)driver;
			WebElement ab	=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		 File src=ab.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\screenshots\\facebooklogol.png");
		 Files.copy(src, dest);
	}
	}
	    
	
//img[@class='fb_logo _8ilh img']