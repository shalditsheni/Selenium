package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://letcode.in/alert");
        driver.findElement(By.id("accept")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        driver.findElement(By.id("confirm")).click();
        Alert alerts = driver.switchTo().alert();
        Thread.sleep(3000);
        alerts.dismiss();
       
        driver.findElement(By.id("prompt")).click();
        Alert alertss = driver.switchTo().alert();
        alertss.sendKeys("Hello");
        Thread.sleep(3000);
        alerts.accept();
        
	}

}
