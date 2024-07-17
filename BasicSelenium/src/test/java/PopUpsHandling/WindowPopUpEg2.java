package PopUpsHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPopUpEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.barbequenation.com/");
		
		WebElement socialLinks = driver.findElement(By.xpath("//ul[contains(@class,'social-media-links')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(socialLinks).perform();
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[contains(@class,'social-media-links')]/li/a/span"));
		for(WebElement link : allLinks) {
			link.click();
			
		}
		
		Set<String> allTabId = driver.getWindowHandles();
		for(String Id : allTabId) {
			driver.switchTo().window(Id);
			if(driver.getTitle().contains("Facebook")) {
				System.out.println(driver.getTitle());
			}else {
				driver.close();
			}
		}
		
	}

}
