package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
//Use drag and drop and clickandHold release to match all boxes

public class DragandDropEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src1 = driver.findElement(By.id("box1"));
		WebElement targ1 = driver.findElement(By.id("box101"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, targ1).build().perform();
		
		WebElement src2 = driver.findElement(By.id("box2"));
		WebElement targ2 = driver.findElement(By.id("box102"));
		act.dragAndDrop(src2, targ2).build().perform();
		
		WebElement src3 = driver.findElement(By.id("box3"));
		WebElement targ3 = driver.findElement(By.id("box103"));
		act.dragAndDrop(src3, targ3).build().perform();
		
		WebElement src4 = driver.findElement(By.id("box4"));
		WebElement targ4 = driver.findElement(By.id("box104"));
		act.dragAndDrop(src4, targ4).build().perform();
		
		WebElement src5 = driver.findElement(By.id("box5"));
		WebElement targ5 = driver.findElement(By.id("box105"));
//		act.dragAndDrop(src5, targ5).build().perform();
		act.clickAndHold(src5).release(targ5).build().perform();
		
		WebElement src6 = driver.findElement(By.id("box6"));
		WebElement targ6 = driver.findElement(By.id("box106"));
//		act.dragAndDrop(src6, targ6).build().perform();
		act.clickAndHold(src6).release(targ6).build().perform();
		
		WebElement src7 = driver.findElement(By.id("box7"));
		WebElement targ7 = driver.findElement(By.id("box107"));
//		act.dragAndDrop(src7, targ7).build().perform();  
		act.clickAndHold(src7).release(targ7).build().perform();
		
		
	}

}
