package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[.='click']")).click();
        
Set<String> windows = driver.getWindowHandles();
        
        for(String window:windows) {
        	
        	driver.switchTo().window(window);
        	String title = driver.getTitle();
        	System.out.println(title);
        	if(title.contains("selenium")) {
        		break;
        		
        	}     	
        	
        }
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
        
        Set<String> windows1 = driver.getWindowHandles();
        
        for(String window:windows1) {
        	
        	driver.switchTo().window(window);
        	String title = driver.getTitle();
        	System.out.println(title);
        	if(title.contains("Frames & windows")) {
        		break;
        		
        	}     	
        	
        }
        
    	
        
        

	}

}
