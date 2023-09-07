package akhila;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {
public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
Dimension d=new Dimension(100,200);
Point p=new Point(400,200);
driver.manage().window().setPosition(p);
}
}
