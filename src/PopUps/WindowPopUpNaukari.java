package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpNaukari {

	

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com/mnjuser/homepage");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[.='Jobs']")).click();
        driver.findElement(By.xpath("//span[.='Remote']")).click();
        
        
        
        
        
        Set<String> windows = driver.getWindowHandles();
        
        for(String window:windows) {
        	
        	driver.switchTo().window(window);
        	String title = driver.getTitle();
        	System.out.println(title);
        	
        	if(title.contains("Remote Jobs"))
        	{
        		Thread.sleep(1000);
        		driver.findElement(By.xpath("//span[.='Fresher Jobs']")).click();
        		break;
        		
        	}
        }
//        Thread.sleep(1000);
//        Set<String> windows1 = driver.getWindowHandles();
//        
//        for(String window:windows1) {
//        	
//        	driver.switchTo().window(window);
//        	String title = driver.getTitle();
//        	System.out.println(title);
//        	
//        	if(title.contains("Jobs - Recruitment"))
//        	{
//        		
//        		break;
//        		
//        	}
//        	
//        	
//	
//
//	}
}
}