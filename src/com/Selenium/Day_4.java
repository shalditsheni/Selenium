package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.getProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/");
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("email")).sendKeys("Shenisj.88@gmail.com");
driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hello");

WebElement fe = driver.findElement(By.name("username"));	
String text = fe.getAttribute("Value");
	System.out.println(text);
	
	driver.findElements(By.xpath("//input[@name=\'username\']")).clear();
	
	}

}
