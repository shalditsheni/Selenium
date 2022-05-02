package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe","webdriver.chrome.driver");
WebDriver driver=new ChromeDriver();
driver.get("http://leafground.com");
driver.findElement(By.linkText("Alert")).click();
WebElement simple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
simple.click();
Alert alert = driver.switchTo().alert();
alert.accept();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
Thread.sleep(3000);
Alert conalert = driver.switchTo().alert();	
conalert.accept();

driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
Thread.sleep(3000);
Alert prompt = driver.switchTo().alert();
Thread.sleep(3000);
prompt.sendKeys("Hello");
Thread.sleep(3000);
prompt.accept();
	}

}
