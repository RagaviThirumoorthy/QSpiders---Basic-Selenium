package locatorsHandling.XPathbySibings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the Matches won, lost, draw, Score difference and points of teams by writing team name as common

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.prokabaddi.com/standings");
		String teamName = "Tamil Thalaivas";
		System.out.println("The team name is "+teamName);
		String won = driver.findElement(By.xpath("//p[text()='"+teamName+"']/../../../following-sibling::div[@class='table-data matches-won']/p")).getText();
		System.out.println("Matches Won: "+won);
		String lost = driver.findElement(By.xpath("//p[text()='"+teamName+"']/../../../following-sibling::div[@class='table-data matches-lost']/p")).getText();
		System.out.println("Matches Lost: "+lost);
		String draw = driver.findElement(By.xpath("//p[text()='"+teamName+"']/../../../following-sibling::div[@class='table-data matches-draw']/p")).getText();
		System.out.println("Matches Draw: "+draw);
		String ScoreDiff = driver.findElement(By.xpath("//p[text()='"+teamName+"']/../../../following-sibling::div[@class='table-data score-diff']/p")).getText();
		System.out.println("Score Difference: "+ScoreDiff);
		String Points = driver.findElement(By.xpath("//p[text()='"+teamName+"']/../../../following-sibling::div[@class='table-data points']/p")).getText();
		System.out.println("Points: "+Points);
	}

}
