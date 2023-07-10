package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelenium {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_mobiles']")).click();
        driver.findElement(By.linkText("Accessories")).click();
        //driver.findElement(By.className("a-dynamic-image sl-sobe-carousel-sub-card-img")).click();
        driver.findElement(By.linkText("Headsets")).click();
        driver.findElement(By.className("sl-sobe-carousel-sub-card-footer")).click();
        		
        
        

	}

}
