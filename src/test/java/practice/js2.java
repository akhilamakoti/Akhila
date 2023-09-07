package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class js2 {
	public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.meesho.com/");
    JavascriptExecutor jse= (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,4000)");
Thread.sleep(3000);    
jse.executeScript("window.scrollBy(0,4000)");
 //String jse=("window.scrollBy(0,4000););
 //Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,-4000)");
Thread.sleep(4000);
	}
}