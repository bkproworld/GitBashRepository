package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopUp {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.className("//a[@class='close']")).click();
        driver.findElement(By.id("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
        
        
	}

}
