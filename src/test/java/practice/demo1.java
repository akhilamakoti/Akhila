package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");	
	driver.findElement(By.name("pwd")).sendKeys("manager");	
driver.findElement(By.id("loginButton")).click();
	}
}
