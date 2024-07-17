package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		
		WebElement disabledEle = driver.findElement(By.xpath("//input[@class='form-control']"));
//		disabledEle.sendKeys("Ragavi");  -->org.openqa.selenium.ElementNotInteractableException: element not interactable 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Ragavi';", disabledEle);
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
