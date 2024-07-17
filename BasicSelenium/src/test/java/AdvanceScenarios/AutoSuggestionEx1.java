package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		for(WebElement sugg: allsugg) {
			Thread.sleep(1000);
			System.out.println(sugg.getText());
			if(sugg.getText().contains("puma sneakers")) {
				sugg.click();
				break;
			}
		}
	}

}
