package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(1000);
        
        //========Here we use Index Value
//        WebElement datelist = driver.findElement(By.id("day"));
//        Select sel = new Select(datelist);
//        sel.selectByIndex(25);
//        
//        WebElement monlist = driver.findElement(By.id("month"));
//       Select sel1= new Select(monlist);
//        sel1.selectByIndex(7);
//       
//        WebElement yrlist = driver.findElement(By.id("year"));
//        Select sel2= new Select(yrlist);
//        sel2.selectByIndex(25);
        
        //=======Here we use Value
//        
//        WebElement datelist = driver.findElement(By.id("day"));
//        Select sel = new Select(datelist);
//        sel.selectByValue("26");
//        
//        WebElement monlist = driver.findElement(By.id("month"));
//       Select sel1= new Select(monlist);
//        sel1.selectByValue("8");
//       
//        WebElement yrlist = driver.findElement(By.id("year"));
//        Select sel2= new Select(yrlist);
//        sel2.selectByValue("1998");
        
        // ==== Here we use VisibleText

        WebElement datelist = driver.findElement(By.id("day"));
        Select sel = new Select(datelist);
        sel.selectByVisibleText("15");
        
        WebElement monlist = driver.findElement(By.id("month"));
       Select sel1= new Select(monlist);
        sel1.selectByVisibleText("Aug");
       
        WebElement yrlist = driver.findElement(By.id("year"));
        Select sel2= new Select(yrlist);
        sel2.selectByVisibleText("2004");
        
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
        
        
        

	}

}
