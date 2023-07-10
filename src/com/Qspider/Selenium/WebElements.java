package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        WebElement font=driver.findElement(By.xpath("//img[contains(@class,'vu')]"));
        
		String data= font.getCssValue("font-size");
		System.out.println(data);
		 
		WebElement color = driver.findElement(By.xpath("//button[text()='Log in']"));
		String data1 = color.getCssValue("color");
		System.out.println(data1);*/
        
//        driver.get("https://www.flipkart.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[text()='✕']")).click();
        
        
        
        
		
        /*driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        WebElement data = driver.findElement(By.xpath("//li[text()='English (UK)']"));
        Point location = data.getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());
        System.out.println(location);
        
        WebElement data1 = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
        Point loc = data1.getLocation();
        System.out.println(loc);
        Dimension val = data1.getSize();
        System.out.println(val.getHeight());
        System.out.println(val.width);
        System.out.println(val);*/
        
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        
        //=== isEnabaled method
       /* WebElement data = driver.findElement(By.id("username"));
        if(data.isEnabled()) {
        	data.sendKeys("admin");
        }
        else {
        	System.out.println("not enabled");
        }*/
        
        
        //====isSelected Method
        /*WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        if(checkbox.isSelected()) {
        	System.out.println("checked");
        }
        else {
        	System.out.println("not checked");
        }*/
        //==== getAttribute method
        /*WebElement data = driver.findElement(By.id("username"));
        String value = data.getAttribute("id");
        System.out.println("Attribute value for id is "+value);
        
        String value2 = data.getAttribute("type");
        System.out.println("Attribute value for type is "+value2);*/
        
        //===tagName
        
        /*WebElement data = driver.findElement(By.id("username"));
        String tag = data.getTagName();
        System.out.println(tag);
        
        WebElement data1 = driver.findElement(By.id("loginButton"));
        String tag1 = data1.getTagName();
        System.out.println(tag1);*/
        
        
        
//        WebElement data = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//         //String value = data.getAriaRole();
//         System.out.println(data.getAriaRole());
//         
//         WebElement data1 = driver.findElement(By.xpath("//div[@class='atProductName']"));
//         System.out.println(data1.getAriaRole());
         
//        WebElement data3 = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
//         System.out.println(data3.getAriaRole());
        
       
         
         
        
        

	}

}
