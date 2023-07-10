package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
         List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
         int count=0;
         for(WebElement webEle:allLinks) {
        	 
        	 System.out.println(webEle.getText());
        	 count++;
         }
         System.out.println("total no of links:" + count);*/
        
        
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.manage().window().maximize();
         List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
         int count=0;
         for(WebElement webEle:allLinks) {
        	 
        	 System.out.println(webEle.getText());
        	 count++;
         }
         System.out.println("total no of links:" + count);
         
         
         
         
         
        

	}

}
