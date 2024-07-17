package AdvanceScenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotEx1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.royalenfield.com/in/en/motorcycles/new-himalayan/");
		Thread.sleep(4000);
		driver.findElement(By.id("customGDPR")).click();
		Thread.sleep(2000);
		
				
//		Precondition: Create a folder in your project for screenshots
//		Steps:
//		1. Type casting --> Driver data type is WebDriver, so Type cast the driver object to TakeScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
//		2. Take the Screenshot and store in source location
		File src =  ts.getScreenshotAs(OutputType.FILE);
//		3. Create a target folder
		File targ =  new File("./Screenshots/RoyalEnfield.png");
//		4. Copy the source to target
		FileHandler.copy(src, targ);
		
		
		
	}

}
