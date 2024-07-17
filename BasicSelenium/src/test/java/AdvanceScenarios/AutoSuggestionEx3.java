package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// search Selenium in google and click any one

public class AutoSuggestionEx3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement sugg : allSugg) {
			Thread.sleep(1000);
			System.out.println(sugg.getText());
			
			if(sugg.getText().contains("selenium training in chennai")) {
				sugg.click();
				break;
			}
		}
	}

}
