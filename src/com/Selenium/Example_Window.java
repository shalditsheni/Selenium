package com.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/windows");
driver.findElement(By.id("home")).click();
String winhand = driver.getWindowHandle();
System.out.println("Parent  " +winhand);
System.out.println(driver.getCurrentUrl());

Set<String> windowHandles = driver.getWindowHandles();
List<String> lis=new ArrayList(windowHandles);
driver.switchTo().window(lis.get(1));
System.out.println(lis);
System.out.println(driver.getCurrentUrl());
driver.switchTo().window(lis.get(0));
System.out.println(driver.getCurrentUrl());
driver.close();
driver.switchTo().window(lis.get(1));
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

Set<String> windowHandles2 = driver.getWindowHandles();
List<String> list=new ArrayList(windowHandles2);
driver.switchTo().window(list.get(0));
System.out.println(driver.getCurrentUrl());
driver.findElement(By.linkText("Tabs")).click();
driver.findElement(By.id("multi")).click();
System.out.println("Titles "+driver.getTitle());
driver.quit();
		
		
	}

}
