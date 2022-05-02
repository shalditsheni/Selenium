package com.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Han {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url=driver.getCurrentUrl();
		System.out.println("Button"+url);
		driver.findElement(By.xpath("//button[text()=\'Goto Home\']")).click();
		String urll=driver.getCurrentUrl();
		System.out.println("home"+urll);
		
		driver.navigate().back();
		String uurl=driver.getCurrentUrl();
		System.out.println("Button"+uurl);
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/");
		
		
		
		
//		String oldwindow = driver.getWindowHandle();
//		driver.findElement(By.id("home")).click();
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Set<String> handles = driver.getWindowHandles();
//		for (String newwindow : handles) 
//		{
//			driver.switchTo().window(newwindow);
//			
//		}
//		String newurl = driver.getCurrentUrl();
//		System.out.println(newurl);
	}

	private static By By(Object xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object xpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
