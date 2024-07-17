package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = 0;
		for(WebElement link:links) {
			//Print the visible text of links
			System.out.println(link.getText());
			//print the url of links
			System.out.println(link.getAttribute("href"));
			count++;
		}
		
		System.out.println("Total number of links: "+count);
	}

}
