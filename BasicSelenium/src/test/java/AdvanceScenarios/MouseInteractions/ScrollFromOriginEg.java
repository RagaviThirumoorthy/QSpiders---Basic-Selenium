package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOriginEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		
		WebElement origin = driver.findElement(By.xpath("//nav[@id='td-section-nav']"));
		ScrollOrigin sc = ScrollOrigin.fromElement(origin);
		
		Actions act = new Actions(driver);
		//Down
		act.scrollFromOrigin(sc, 0, 300).perform();
		Thread.sleep(2000);
		//Up
		act.scrollFromOrigin(sc, 0, -400).perform();
		Thread.sleep(2000);
		//Down]
		act.scrollFromOrigin(sc, 0, 500).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
