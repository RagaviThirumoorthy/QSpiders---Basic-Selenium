package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmountEg2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		Actions act = new Actions(driver);
		//Scroll Right
		act.scrollByAmount(2000, 0).perform();
		Thread.sleep(2000);
		//Scroll Left
		act.scrollByAmount(-1500, 0).perform();
		Thread.sleep(2000);
		//Scroll Right
		act.scrollByAmount(2200, 0).perform();
		Thread.sleep(2000);
		//Scroll Left
		act.scrollByAmount(-2000, 0).perform();
		Thread.sleep(2000);
		
		driver.quit();	

	}

}
