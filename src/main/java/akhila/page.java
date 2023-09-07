
	package akhila;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class page{
		public static void main(String[] args) {
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in/");
	String sr=driver.getPageSource();
	System.out.println(sr);
		}
}
