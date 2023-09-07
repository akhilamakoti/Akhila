package akhila;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list {
	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.ltmetro.com/");
	WebElement from=driver.findElement(By.xpath("//select[(@id='from-st-name')]"));
	Thread.sleep(3000);
	Select s=new Select(from);
	Thread.sleep(3000);      
	s.selectByVisibleText("Kukatpally");
WebElement  to=driver.findElement(By.xpath("//select[(@id='to-st-name')]"));
Thread.sleep(3000);
Select s1=new Select(to);
Thread.sleep(3000);
s1.selectByVisibleText("Moosapet");
}
}