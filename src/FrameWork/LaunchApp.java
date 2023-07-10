package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //FileInputStream fis = new FileInputStream("./DataOfSelenium.properties");
        FileInputStream fis = new FileInputStream("C:\\Selenium Class document\\DataOfSelenium.properties");
        
        
        Properties pro = new Properties();
        pro.load(fis);
        
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        
        driver.get(url);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        

	}

}
