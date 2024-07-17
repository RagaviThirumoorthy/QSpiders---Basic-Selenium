package PopUpsHandling.Assessments;

import java.lang.reflect.Array;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to snowcityblr website, Click on Contact Us, Click on the Directions icon in Maps and Fetch the title of newly opened tab

public class IFrameHandlingEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/");
		
		//Click on Contact Us
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		Thread.sleep(2000);
				
		//Click on the Directions icon in Maps
		WebElement maps = driver.findElement(By.xpath("//iframe[contains(@src,'maps')]"));
		driver.switchTo().frame(maps);		
		driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click();
		Thread.sleep(2000);
		
		//Fetch the title of newly opened tab
		driver.switchTo().defaultContent();
		Set<String> allTabId = driver.getWindowHandles();
		for(String Id : allTabId) {
			driver.switchTo().window(Id);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Maps")) {
				System.out.println(driver.getTitle());
			}
			
		}  
				
		driver.quit();
	}

}
