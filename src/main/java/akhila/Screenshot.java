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

public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement ab	=driver.findElement(By.xpath("//img[@width='75']"));

	 File src=ab.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\screenshots\\flipkarlogo.png");
	 Files.copy(src, dest);
}
}
//img[@width='75']