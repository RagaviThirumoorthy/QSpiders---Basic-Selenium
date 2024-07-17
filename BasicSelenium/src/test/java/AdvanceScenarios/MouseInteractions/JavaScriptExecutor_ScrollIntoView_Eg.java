package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_ScrollIntoView_Eg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/partner-with-us");
		
		WebElement faq = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", faq);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true);", faq);
		Thread.sleep(1000);
		
		driver.quit();
	}

}
