package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.linkText("Drop down")).click();
	//	WebElement drop = driver.findElement(By.id("dropdown1"));
	//Select sel=new Select(drop);
		//sel.selectByValue("3");
		//sel.selectByIndex(0);
		//sel.selectByVisibleText("Selenium");
		
		WebElement fd = driver.findElement(By.xpath("//*[@id=\'dropdown1\']/option[1]"));
		fd.click();
		Select sel=new Select(fd);
		List<WebElement> web = sel.getOptions();
		Thread.sleep(3000);
		int size = web.size();
		System.out.println(size);
	
	}

}
