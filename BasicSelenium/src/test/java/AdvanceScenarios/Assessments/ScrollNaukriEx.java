package AdvanceScenarios.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Navigate to Naukri, Click Register button, Scroll down and click on the "Im experienced" button

public class ScrollNaukriEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		WebElement exp = driver.findElement(By.xpath("//h2[contains(text(),'experienced')]"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(exp).perform();
		Thread.sleep(2000);
		
		exp.click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}

// Do both tasks, perform scrolling using Java script executor
