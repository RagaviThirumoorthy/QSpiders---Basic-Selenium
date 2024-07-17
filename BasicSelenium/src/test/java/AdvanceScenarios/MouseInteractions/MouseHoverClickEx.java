package AdvanceScenarios.MouseInteractions;

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

public class MouseHoverClickEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion =  driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).build().perform();
		Thread.sleep(1000);
		
		WebElement topWear =  driver.findElement(By.partialLinkText("Men's Top Wear"));
		act.moveToElement(topWear).build().perform();
		Thread.sleep(1000);
		
		WebElement tShirt = driver.findElement(By.partialLinkText("Men's T-Shirts"));
		act.moveToElement(tShirt).click().build().perform();
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/FlipkartMouseHover.png");
		FileHandler.copy(src, targ);
		
		driver.close();
		
	}

}
