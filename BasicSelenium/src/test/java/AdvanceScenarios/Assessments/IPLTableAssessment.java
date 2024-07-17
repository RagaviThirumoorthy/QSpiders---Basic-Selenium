package AdvanceScenarios.Assessments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the total points and Recent Matches won and last count from the IPL table

public class IPLTableAssessment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.iplt20.com/points-table/");
		String team = "CSK";
		int wCount = 0;
		int lCount = 0;
						
		System.out.println("The team is "+team);
		String point = driver.findElement(By.xpath("//h2[text()='"+team+"']/../../../td[@class='bt ng-binding']")).getText();
		System.out.println("Total points : "+point);
				
		System.out.println("Recent Matches Results");
		List<WebElement> recentLists = driver.findElements(By.xpath("//h2[text()='"+team+"']/../../../td[contains(@class,'ih-pt-fb-w')]/div/span"));
		for(WebElement recentList :recentLists) {
			System.out.println(recentList.getText());
			if(recentList.getText().contains("W")) {
				wCount++;
			}else {
				lCount++;
			}
		}
		System.out.println("Matches Won: "+wCount);
		System.out.println("Matches Lost: "+lCount);
	
		
	}

}
