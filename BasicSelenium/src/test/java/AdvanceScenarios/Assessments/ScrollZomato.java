package AdvanceScenarios.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

//Navigate to Zomato, Click on Add Restaurent, SCroll down to FAQ and take the screenshot of wntire webpage

public class ScrollZomato {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Add restaurant")).click();
		Thread.sleep(2000);
		WebElement faq = driver.findElement(By.xpath("//h5[text()='What happens if the average order value of Zomato orders is very low']"));
		Actions act = new Actions(driver);
		act.scrollToElement(faq).perform();
		Thread.sleep(2000);
		act.scrollToElement(faq).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/ZomatoFAQ.png");
		FileHandler.copy(src, targ);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
