package AdvanceScenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for(WebElement sugg : allSugg) {
			Thread.sleep(1000);
			System.out.println(sugg.getText());
			if(sugg.getText().contains("nike air jordan")) {
				sugg.click();
				break;
			}
		}
	}

}





