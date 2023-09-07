package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
//clickon sub it
driver.findElement(By.xpath("//input[@name='submit']")).click();
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
String text=driver.switchTo().alert().getText();
System.out.println(text);

//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();

	}

}
