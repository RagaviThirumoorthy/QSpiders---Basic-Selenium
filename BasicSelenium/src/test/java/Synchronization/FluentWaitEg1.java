package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/6");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement productTitle = driver.findElement(By.xpath("//h4[text()='APPLE iPhone 14 Pro']"));
		System.out.println(productTitle.getText());
		
		WebElement productPrice = driver.findElement(By.xpath("//p[@class='CalculateOffer_wrapper__2XD4R']/span[1]"));
		System.out.println(productPrice.getText());
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("639203");
		//Fluent Wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		
		WebElement result = driver.findElement(By.id("Check Delivery-helper-text"));
		System.out.println(result.getText());
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
