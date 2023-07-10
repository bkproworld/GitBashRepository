package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Banti Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/droppable/");
        
        driver.switchTo().frame(0);
        Actions act= new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
        

     act.dragAndDrop(drag, drop).perform();
     //act.clickAndHold(drag).perform();
     //act.release(drop).perform();

	}

}
