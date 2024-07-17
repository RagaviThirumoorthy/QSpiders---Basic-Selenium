package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Search Mango in bigbasket and click any one

public class AutoSuggestionEx4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Mango");
		Thread.sleep(2000);
//		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='overscroll-contain']/li")); -->No link so Not clicking 
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='overscroll-contain']/li/div[2]/a"));
		
		for(WebElement sugg: allSugg) {
			Thread.sleep(1000);
			System.out.println(sugg.getText());
			System.out.println();
			if(sugg.getText().contains("Kesar Mango")) {
				sugg.click();
				break;
			}
		}
		
	}

}
