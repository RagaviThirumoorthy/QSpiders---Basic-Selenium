package PopUpsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: "+alert.getText());
		Thread.sleep(1000);
		//Click on Reject button in the alert
		alert.dismiss();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println("The result is: "+result.getText());
		Thread.sleep(2000);
		
		driver.quit();

	}

}
