package com.Projects;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheni\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();

        driver.findElement(By.id("email_create")).sendKeys("sshhhh@gmail.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.findElement(By.xpath("//i[@class=\'icon-user left\']")).click();
        driver.findElement(By.xpath("//input[@name='id_gender' and @id='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Shal");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Sheni");
        driver.findElement(By.xpath("//input[@type='password' and @name='passwd']")).sendKeys("SheniSherah");
        WebElement date = driver.findElement(By.id("days"));
        Select ddate=new Select(date);
        ddate.selectByIndex(13);
        
        WebElement month = driver.findElement(By.id("months"));
        Select mmonth=new Select(month);
        mmonth.selectByVisibleText("September ");
        
        WebElement year = driver.findElement(By.id("years"));
        Select yyear=new Select(year);
        yyear.selectByValue("2000");

        driver.findElement(By.name("optin")).click();
        driver.findElement(By.id("company")).sendKeys("Infotech");
        driver.findElement(By.name("address1")).sendKeys("Electronic City, Bangalore");
        driver.findElement(By.name("address2")).sendKeys("Tower B Floor Second");
        driver.findElement(By.name("city")).sendKeys(" Bangalore");
        WebElement state = driver.findElement(By.name("id_state"));
        Select sstate=new Select(state);
        sstate.selectByValue("5");
        driver.findElement(By.id("postcode")).sendKeys("56010");
        driver.findElement(By.name("other")).sendKeys("Next to the SBI Bank");
        driver.findElement(By.id("phone_mobile")).sendKeys("9844703864");
        driver.findElement(By.xpath("//input[@value='My address']")).sendKeys("  Kanyakumari District");
        driver.findElement(By.id("submitAccount")).click();
        String uurl = driver.getCurrentUrl();
        System.out.println(uurl);
        driver.findElement(By.xpath("//a[@title='Women']")).click();
       WebElement hover = driver.findElement(By.xpath("//body[@id='category']"));
       Actions builder=new Actions(driver);
       builder.moveToElement(hover).perform();
       driver.findElement(By.id("category")).click();
       driver.findElement(By.xpath("//img[@itemprop=\'image\']")).click();
       driver.switchTo().frame(0);
       driver.findElement(By.xpath("//span[text()='Add to cart']//parent::button")).click();
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
       driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
     driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
     driver.findElement(By.id("uniform-cgv")).click();
     driver.findElement(By.xpath("//button[@type='submit' and @name='processCarrier']")).click();
     driver.findElement(By.xpath("//a[@title=\'Pay by bank wire\']")).click();
     driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
     
       
       
       
       //"//span[contains(text(),'Proceed to checkout')]//parent::a//parent::p"
       
       

	}

}
