package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleClickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClickbutton).build().perform();
			
		
	}

}
