package akhila;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 WebElement ele=driver.findElement(By.xpath("//a[@class='gb_y']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).doubleClick().perform();
		 
	}

}
