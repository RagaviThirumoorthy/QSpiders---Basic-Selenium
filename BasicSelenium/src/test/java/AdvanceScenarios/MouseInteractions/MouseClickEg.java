package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naturalicecreams.in/");
		
		WebElement products = driver.findElement(By.xpath("(//span[contains(text(),'Products')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(products).build().perform();
		
		WebElement festives = driver.findElement(By.xpath("(//a[@href='/category/festive-special'])[1]"));
		act = new Actions(driver);
		act.moveToElement(festives).click().build().perform();
				
	}

}



// Mouse hover Fashion-->Men's-->'Mens Tshirt' in facebook and click and then take the screenshot