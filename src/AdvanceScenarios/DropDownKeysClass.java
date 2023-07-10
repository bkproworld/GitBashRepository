package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownKeysClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(1000);
        WebElement dayList = driver.findElement(By.xpath("//select[@title='Day']"));
        dayList.click();
        dayList.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dayList.sendKeys(Keys.ARROW_DOWN);
        
        
        
	}

}
