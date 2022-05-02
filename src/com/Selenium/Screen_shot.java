package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot {
	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		//driver.navigate().forward();
		//driver.navigate().back();
		driver.navigate().refresh();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\sheni\\eclipse-workspace\\Selenium\\Snap\\image.png");
		FileHandler.copy(sc, des);
		
		
		
		
		
	}
}

		