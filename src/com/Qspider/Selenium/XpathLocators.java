package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.actitime.com/login.do");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        //driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Samsung s22");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S22 5G (Phantom White, 128 GB)']")).click();
       // driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy S22 5G (Phantom Black, 256 GB)']")).click();
        driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy S22 5G (Phantom White, 128 GB)']")).click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        
        
        
        
        

	}

}
