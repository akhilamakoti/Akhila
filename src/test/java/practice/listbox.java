package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.facebook.com/");	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	//select dpdwn and store into ref variable
	WebElement akhila = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(2000);
	Select s=new Select(akhila);
	Thread.sleep(2000);
	s.selectByVisibleText("Apr");
WebElement day=driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
	Select s1=new Select(day);
	Thread.sleep(2000);	
	s1.selectByVisibleText("1997");
WebElement akhila2=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
Select S2=new Select(akhila2);
Thread.sleep(2000);
S2.selectByVisibleText("30");
}
}

	
	
	
	
	
	
	
	
	
	
	
	

