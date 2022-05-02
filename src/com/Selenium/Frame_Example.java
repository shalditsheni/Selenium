package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//driver.switchTo().frame(1);
		driver.switchTo().frame("firstFr");
		WebElement fd = driver.findElement(By.name("fname"));
		fd.sendKeys("Hello");
		driver.findElement(By.name("lname")).sendKeys("Name");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("email");
		driver.switchTo().parentFrame()
		driver.findElement(By.linkText("Watch tutorial")).click();
		
		
	}

}
