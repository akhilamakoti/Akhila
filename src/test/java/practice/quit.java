package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class quit {
	public static void main(String args[]) throws Throwable {
	     WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(4000);
driver.manage().window().minimize();
Thread.sleep(5000);
//driver.close();
//driver.quit();

	}
}


