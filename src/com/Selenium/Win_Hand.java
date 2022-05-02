package com.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Hand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.drive", "C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/windows");
String windowHandle = driver.getWindowHandle();
System.out.println("Main window"+ windowHandle);
String firsturl = driver.getCurrentUrl();
System.out.println(firsturl);
driver.findElement(By.id("home")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println("New window"+ windowHandles);
List<String> lis =new ArrayList(windowHandles);
driver.switchTo().window(lis.get(1));
String secondturl = driver.getCurrentUrl();
System.out.println(secondturl);
driver.quit();

	}

}
