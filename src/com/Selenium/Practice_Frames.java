package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[.=\'Frame\']")).click();
		String text = driver.findElement(By.xpath("//h1[.='Fun with frames']")).getText();
		System.out.println(text);
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();
		
		//WebElement fra = driver.findElement(By.xpath("//button[@id='Click']"));
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		//driver.quit();
		

	}

}
