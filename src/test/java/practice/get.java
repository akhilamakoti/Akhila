package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class get {
	public static void main(String args[])throws Throwable {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.com/");
	     String tit = driver.getTitle();
	     System.out.println(tit);
	}
}






