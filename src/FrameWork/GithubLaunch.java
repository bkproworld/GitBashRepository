package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLaunch {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //FileInputStream fis = new FileInputStream("./DataOfSelenium.properties");
        FileInputStream fis = new FileInputStream("./Github.properties");
        
        
        Properties pro = new Properties();
        pro.load(fis);
        
        String url = pro.getProperty("url");
        String un = pro.getProperty("Username");
        String pwd = pro.getProperty("Password");
        
       driver.get(url);
      
       driver.findElement(By.xpath("//input[@name='login']")).sendKeys(un);
       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@name='commit']")).click();

	}

}
