package AdvanceScenarios.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//1 - Navigate to google, enter your name, clear and enter selenium, capture the screen shot of entire web page. Don’t use clear(). 

public class KeyboardEx1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement search =  driver.findElement(By.name("q"));
		search.sendKeys("Ragavi");
		search.sendKeys(Keys.CONTROL,"a");
		search.sendKeys(Keys.CONTROL,Keys.BACK_SPACE);
		
/*		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).build().perform();
		act.keyDown(Keys.BACK_SPACE).build().perform();
		act.keyUp(Keys.BACK_SPACE).build().perform();
		act.keyUp(Keys.CONTROL).build().perform();  */
		
		Thread.sleep(1000);
		search.sendKeys("selenium");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/GoogleSearch.png");
		FileHandler.copy(src, targ);
			
	}

}
