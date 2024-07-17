package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleAlertEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Right Click
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).build().perform();
		Thread.sleep(2000);
		
		WebElement quitEle =  driver.findElement(By.xpath("//span[text()='Quit']"));
		act.click(quitEle).build().perform();
		Thread.sleep(2000);
		
		//Switching driver focus to alert
		Alert alert = driver.switchTo().alert();
		//Print alert message
		System.out.println(alert.getText()); 
		//Accept the alert
		alert.accept();
		
		driver.quit();
	}

}




