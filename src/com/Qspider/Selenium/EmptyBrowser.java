package com.Qspider.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EmptyBrowser {

	public static void main(String[] args)  {
		//Launching empty browser
		
		String key = "webdriver.edge.driver";
		String value = "C:\\Users\\Banti Kumar\\Downloads\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new EdgeDriver();
		
		
//		WebDriver driver = new EdgeDriver();
//		//WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		//driver.get("https://www.amazon.in/");
//		String data = driver.getTitle();
//		System.out.println(data);
//		
//		driver.get("https://www.myntra.com/");
//		String data1 = driver.getTitle();
//		System.out.println(data1);
//		
//		driver.get("https://www.cricbuzz.com/");
//		String data2 = driver.getTitle();
//		System.out.println(data2);
//		
//		driver.close();
		driver.get("https://www.flipkart.com/");
//		String sourcecode=driver.getPageSource();
//		System.out.println(sourcecode);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		
		
		//driver.quit();
		
		
		
//		driver.manage().window().maximize();
//		
//		
//		driver.manage().window().minimize();
//		Thread.sleep(10000);
		
		driver.manage().window().fullscreen();
		
		
		
		
		
		
		
		
		
	}

}
