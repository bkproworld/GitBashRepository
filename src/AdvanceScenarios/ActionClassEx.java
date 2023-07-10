package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
//        driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		
//		WebElement data = driver.findElement(By.xpath("//img[@alt='Travel']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(data).perform();
//        act.contextClick(data).perform();////++++++ contextclick is used to inspect the particular data
		
//        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//        WebElement data = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//        Actions ac = new Actions(driver);
//        ac.doubleClick(data).perform();
        
//        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//        WebElement drag = driver.findElement(By.id("draggable"));
//        WebElement drop = driver.findElement(By.id("droppable"));
//        Thread.sleep(1000);
 //      Actions act = new Actions(driver);
//        act.dragAndDrop(drag, drop).perform();
//        act.clickAndHold(drag).perform();
//        act.release(drop).perform();
        
        driver.get("https://demo.actitime.com/login.do");
        WebElement un = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.name("pwd"));
        WebElement login = driver.findElement(By.id("loginButton"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Actions act = new Actions(driver);
//        act.sendKeys(un,"admin").perform();
//        act.sendKeys(pwd,"manager").perform();
//        act.sendKeys(login).perform();
        
        act.sendKeys(un,"admin").sendKeys(pwd,"manager").sendKeys(login).build().perform();
        

	}

}
