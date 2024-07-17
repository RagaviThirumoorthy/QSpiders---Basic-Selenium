package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message: "+alert.getText());
		//Send value to alert
		alert.sendKeys("Hi Ragavi!!!");
		Thread.sleep(2000);
		alert.accept();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println("The result is: "+result.getText());
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
