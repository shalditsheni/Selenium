package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("//table[@name='listtable']"));
		List<WebElement> head = table.findElements(By.tagName("th"));
		for (WebElement header:head)
		{
			System.out.println(header.getText());
		}
		List<WebElement> body = table.findElements(By.tagName("td"));
		for (WebElement bodydata:body)
		{
			System.out.println(bodydata.getText());
		}
		List<WebElement> hb = table.findElements(By.tagName("tr"));
		for (WebElement data:hb)
		{
			System.out.println(data.getText());
		}
		List<WebElement> onlybodydata = table.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
		int size = onlybodydata.size();
		System.out.println(size);
		for (WebElement rowdata:onlybodydata)
		{
			List<WebElement> col = rowdata.findElements(By.tagName("td"));
			WebElement ccol = col.get(1);
					System.out.println(ccol.getText());
		}
		}
	}
