package practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_frame {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
driver.switchTo().frame(0);
String s=driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
System.out.println(s);
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.switchTo().frame(1);

                String d = driver.findElement(By.xpath("(//a[text()='AbstractAnnotations'])[1]")).getText();
                System.out.println(d);
                Thread.sleep(2000);
                driver.switchTo().defaultContent();
                driver.switchTo().frame(2);
                String d1=driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.concurrent'])[1]")).getText();
                System.out.println(d1);

}
}