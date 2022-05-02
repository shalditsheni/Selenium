package com.Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://adactinhotelapp.com/SearchHotel.php");
        driver.findElement(By.id("username")).sendKeys("shenisherahh");
        driver.findElement(By.id("password")).sendKeys("sheni123");
        driver.findElement(By.id("login")).click();
        WebElement location = driver.findElement(By.name("location"));
        Select loca=new Select(location);
        loca.selectByValue("Paris");
        
        WebElement hotels = driver.findElement(By.id("hotels"));
        Select hotel=new Select(hotels);
        hotel.selectByVisibleText("Hotel Sunshine");
        
        WebElement roomtype = driver.findElement(By.id("room_type"));
        Select room=new Select(roomtype);
        room.selectByVisibleText("Deluxe");
        
        WebElement roomnos = driver.findElement(By.id("room_nos"));
        Select roomnumber=new Select(roomnos);
        roomnumber.selectByValue("5");
       
        WebElement dob = driver.findElement(By.id("datepick_in"));
        dob.clear();
        dob.sendKeys("17/03/2022");
        
        WebElement doc= driver.findElement(By.id("datepick_out"));
        doc.clear();
        doc.sendKeys("21/03/2022");
       
        WebElement adultroom = driver.findElement(By.name("adult_room"));
        Select adult=new Select(adultroom);
        adult.selectByValue("4");
        
        WebElement childroom = driver.findElement(By.name("child_room"));
        Select child=new Select(childroom);
        child.selectByIndex(3);
        
       driver.findElement(By.id("Submit")).click();
       driver.findElement(By.name("radiobutton_0")). click();
       driver.findElement(By.id("continue")).click();
       
       driver.findElement(By.name("first_name")).sendKeys("Sheny");
       driver.findElement(By.name("last_name")).sendKeys("Sherah");
       driver.findElement(By.name("address")).sendKeys("Door No 401, Tower B, Bangalore");
       driver.findElement(By.id("cc_num")).sendKeys("1234567891023456");
       
       WebElement cards = driver.findElement(By.id("cc_type"));
       Select card=new Select(cards);
       card.selectByValue("VISA");
       
       WebElement dobirth = driver.findElement(By.name("cc_exp_month"));
       Select dobb=new Select(dobirth);
       dobb.selectByValue("11");
      
       
       WebElement doyear = driver.findElement(By.id("cc_exp_year"));
       Select year=new Select(doyear);
       year.selectByValue("2022");
       
       driver.findElement(By.id("cc_cvv")).sendKeys("521");
       driver.findElement(By.id("book_now")).click();
       
       driver.findElement(By.id("my_itinerary")).click();
       driver.findElement(By.name("check_all")).click();
	}

}
