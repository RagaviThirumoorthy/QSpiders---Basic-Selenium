package AdvanceScenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardWithActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
//		Step 1: Create object for Actions class
		Actions act = new Actions(driver);
//		Step 2: To press the key
		act.keyDown(Keys.SHIFT).sendKeys("selenium").build().perform();
//		Step 3: To release the key
		act.keyUp(Keys.SHIFT).build().perform();

		
	}

}
