package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathbytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.name("pwd")).sendKeys("manager");

	   
	}

}
