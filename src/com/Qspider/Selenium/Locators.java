package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new EdgeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.className("initial")).click();
		//driver.get("https://www.facebook.com/");
		
		//WebDriver driver = new ChromeDriver();
		
		
		//=========FACEBOOOK AUTOMATION BY SELENIUM=======//
//        driver.manage().window().maximize();
//        driver.get("https://www.facebook.com");
//        driver.findElement(By.id("email")).sendKeys("");
//        driver.findElement(By.id("pass")).sendKeys("");
//        //Thread.sleep(1000);
//        driver.findElement(By.name("login")).click(); 
//        Thread.sleep(7000);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        //driver1.get("https://www.youtube.com/");
       
//		driver.findElement(By.className("initial")).click();
        
        driver1.get("https://demo.actitime.com/login.do");
        driver1.manage().window().maximize();
        
		driver1.findElement(By.id("username")).sendKeys("admin");
		driver1.findElement(By.name("pwd")).sendKeys("manager");
		driver1.findElement(By.className("initial")).click();
		Thread.sleep(5000);
		
		//linktext locator
		//driver1.findElement(By.linkText("View Time-Track")).click();
		
		//partiallinktext locator
		driver1.findElement(By.partialLinkText("View T")).click();
		
		
		
	}

}
