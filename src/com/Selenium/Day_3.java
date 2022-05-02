package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		String tit = driver.getTitle();
		System.out.println(tit);
		String uu = driver.getCurrentUrl();
		System.out.println(uu);
		String page = driver.getPageSource();
		System.out.println(page);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("email")).sendKeys("shenisj.88@gmail.com");
        driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("String");
        WebElement findElement = driver.findElement(By.name("username"));
        String attribute = findElement.getAttribute("Value");
        System.out.println(attribute);
        driver.findElement(By.xpath("//input[@value=\'Clear me!!\']")).clear();
        boolean enabled = driver.findElement(By.xpath("//input[@disabled=\'true\']")).isEnabled();
        System.out.println(enabled);
        
	}
}
