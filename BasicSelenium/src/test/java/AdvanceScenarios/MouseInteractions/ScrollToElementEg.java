package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement element = driver.findElement(By.xpath("//label[text()='HILL RAILWAYS']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
