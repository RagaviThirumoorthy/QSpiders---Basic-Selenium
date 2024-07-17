package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmountEg1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		//Scroll Down
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, 1000).perform();
		Thread.sleep(2000);
		//Scroll Up
		act.scrollByAmount(0, -1000).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
