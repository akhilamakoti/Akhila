package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.in/");
    driver.findElement(By.partialLinkText("Gm")).click();

}
}