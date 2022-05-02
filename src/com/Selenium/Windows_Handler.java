package com.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		String parent = driver.getWindowHandle();
		System.out.println("Parent :" +parent);
		driver.findElement(By.id("home")).click();
		Set<String> winhan = driver.getWindowHandles();
		List<String> li=new ArrayList(winhan);
		System.out.println(li);
		driver.switchTo().window(li.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
