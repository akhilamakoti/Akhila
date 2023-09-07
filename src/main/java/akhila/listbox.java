package akhila;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.ltmetro.com/");
	driver.findElement(By.xpath("//select[@id='from-st-name')]"));
	Select s=new Select(from);
	Thread.sleep(3000);
}
}