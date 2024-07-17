package AdvanceScenarios.Assessments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div/div[1]/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']")).getText();
		//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='yRaY8j ZYYwLA']
		System.out.println(price);
	}

}
