package akhila;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsiz {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/");
    Dimension d=new Dimension(100,200);
    driver.manage().window().setSize(d);

		
	}
	

}
