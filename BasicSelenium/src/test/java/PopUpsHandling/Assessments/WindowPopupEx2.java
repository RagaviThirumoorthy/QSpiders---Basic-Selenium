package PopUpsHandling.Assessments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


//Navigate to IRCTC--> Scroll down to links-->Click on all the links one by one
//Switch the driver focus to LinkedIn, enter email and password in LinkedIn page,
//capture the screenshot of entire linkedin page and close other tabs

public class WindowPopupEx2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement aboutUs = driver.findElement(By.xpath("//span[text()='About us']"));
		Actions act = new Actions(driver);
		act.scrollToElement(aboutUs).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.id("disha-banner-close")).click();
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'footer-icons')]/span[2]/a"));
		for(WebElement link: links) {
			link.click();
			Thread.sleep(2000);
		}
		
		Set<String> allId = driver.getWindowHandles();
		for(String Id : allId) {
			driver.switchTo().window(Id);
			if(driver.getTitle().contains("LinkedIn")) {
				driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys("ragavi2711@gmail.com");
				driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys("Ragavi27");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File targ = new File("./Screenshots/IRCTCLinkedIn.png");
				FileHandler.copy(src, targ);
			}
			else {
				driver.close();
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
