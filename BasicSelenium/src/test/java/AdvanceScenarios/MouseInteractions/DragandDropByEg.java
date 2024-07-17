package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropByEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(2000);
		WebElement point1 = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div"));
		WebElement point2 = driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']/div"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(point1, 50, 0).build().perform();	
//		act.dragAndDropBy(point2, 0 , 20).build().perform();
				
	}

}
