package AdvanceScenarios.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollZomato_JavaScriptExecutor_Ex {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Add restaurant")).click();
		Thread.sleep(2000);
		WebElement faq = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",faq);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", faq);
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/ZomatoFAQ1.png");
		FileHandler.copy(src, targ);
		Thread.sleep(2000);
		
		driver.quit();
		
				
	}

}
