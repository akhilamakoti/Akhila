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

public class Actitime_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement ab	=driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		 File src=ab.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\screenshots\\actitimelogo.png");
		 Files.copy(src, dest);
	}
	}
//div[@class='atLogoImg']