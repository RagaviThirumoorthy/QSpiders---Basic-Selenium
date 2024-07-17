package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
				
		WebElement src = driver.findElement(By.id("box3"));
		WebElement targ = driver.findElement(By.id("box103"));
			
		Actions act = new Actions(driver);
		act.dragAndDrop(src, targ).build().perform();
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.id("box6"));
		WebElement targ1 = driver.findElement(By.id("box106"));
		
		act.clickAndHold(src1).release(targ1).build().perform();
		Thread.sleep(2000);
	}

}



