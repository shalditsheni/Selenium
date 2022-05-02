package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://leafground.com");

driver.findElement(By.linkText("Radio Button")).click();

WebElement findElement = driver.findElement(By.xpath("//*[@id='yes']"));
findElement.click();
boolean selected = findElement.isSelected();
System.out.println(selected);






	}

}
