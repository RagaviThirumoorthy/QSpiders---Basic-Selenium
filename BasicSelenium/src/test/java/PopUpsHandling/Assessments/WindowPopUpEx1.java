package PopUpsHandling.Assessments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Navigate to Zomato page, Scroll down to social links and click all social links(5) and fetch the title of all the tabs

public class WindowPopUpEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//Scroll down to Social links
		WebElement socialLinks = driver.findElement(By.xpath("//h6[text()='Social links']"));
		Actions act =new Actions(driver);
		act.scrollToElement(socialLinks).perform();
		Thread.sleep(1000);
		
		//Click all social links
		List<WebElement> links = driver.findElements(By.cssSelector(".sc-elhb8j-17.iDzUMo"));
		for(WebElement link: links) {
			link.click();
		}
		
		//Print title of all tabs
		Set<String> allTabId = driver.getWindowHandles();
		System.out.println("Number of tabs: "+allTabId.size());
		for(String Id : allTabId) {
			driver.switchTo().window(Id);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();

	}

}
