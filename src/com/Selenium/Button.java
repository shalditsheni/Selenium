package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		driver.findElement(By.linkText("Button")).click();
		WebElement fd = driver.findElement(By.id("position"));
		Dimension size = fd.getSize();
		System.out.println(size);
		WebElement findElement = driver.findElement(By.id("color"));
		String cssValue = findElement.getCssValue("background-color");
		System.out.println(cssValue);

	}

}
