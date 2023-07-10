package com.Qspider.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartXpathLocatorsPractice {

	public static void main(String[] args) throws Throwable {
		
		//WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement data = driver.findElement(By.xpath("//input[@name='q']"));
		data.sendKeys("iphone12");
		data.submit();
		Thread.sleep(1000);
		WebElement data1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (White, 64 GB)']"
				+ "/ancestor::div[contains(@class,'pLy-c row')]"
				+ "/descendant::div[text()='₹53,999']"));
		String value = data1.getText();
		System.out.println(value);
        
        
		

	}

}
