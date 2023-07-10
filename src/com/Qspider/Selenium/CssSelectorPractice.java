package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        
//        driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
//        
//        driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
//        
//        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
//        
//        driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
        
        
        driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
        
        driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
        
        
		

	}

}
