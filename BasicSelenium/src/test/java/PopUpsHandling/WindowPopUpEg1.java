package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Get title of main page
		System.out.println(driver.getTitle());
		//Get session Id of main page
		String mainPageId =  driver.getWindowHandle();
		System.out.println("Session Id of main page: "+mainPageId);
		//Click link
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		//Number of sessions
		Set<String> allTabId = driver.getWindowHandles();
		System.out.println("Number of tabs: "+allTabId.size());
		//Print all sessions title
		for(String id : allTabId) {
//			Switch driver focus
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().window(mainPageId);
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}


