package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe","webdriver.chrome.driver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("shopping"));
		List<WebElement> fulltable = table.findElements(By.tagName("th"));
		for (WebElement data : fulltable) {
			System.out.println(data.getText());
		}
			
			List<WebElement> row = table.findElements(By.tagName("tr"));
			int size = row.size();
			System.out.println(size);
			for (WebElement rowdata:row)
			{
				List<WebElement> rrrr = rowdata.findElements(By.tagName("tr"));
			//	System.out.println(rowdata.getText());
				
				WebElement web=rrrr.get(1);
				System.out.println(web.getText());
			}
			
		
	
	
		}

	}


