
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
public class screenshot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 WebElement abc=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	 File src=abc.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\screenshots\\googlepage\\png");
	 Files.copy(src, dest);
}
}
