package AdvanceScenarios.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollNaukri_JavaScriptExecutor_Ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h2[contains(text(),'experienced')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",target);
		Thread.sleep(2000);
		target.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
