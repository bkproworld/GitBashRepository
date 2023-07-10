package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //driver.get("https://demo.actitime.com/login.do");
        //driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE.ENTER);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14",Keys.ENTER);
	}

}
