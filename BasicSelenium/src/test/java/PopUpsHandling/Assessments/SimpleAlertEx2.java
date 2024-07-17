package PopUpsHandling.Assessments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2. Navigate to Burgerking.com, Click cart icon, Print the alert text and click ok button in alert

public class SimpleAlertEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.burgerking.in/");
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		driver.quit();

	}

}
