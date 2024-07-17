package HandlingDropdowns.Assessments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Select 11 members from 1st dropdown and fetch all members from 2nd dropdown

public class CricketTeamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/DropDown.html");
		
		WebElement dropdown1 =  driver.findElement(By.id("dropdown1"));
		Select s = new Select(dropdown1);
		s.selectByValue("Virat Kohli");
		s.selectByValue("Rohit Sharma");
		s.selectByValue("Ravichandran Ashwin");
		s.selectByValue("KL Rahul");
		s.selectByValue("Ravindra Jadeja");
		s.selectByVisibleText("Mohammad Shami");
		s.selectByVisibleText("Axar Patel");
		s.selectByVisibleText("SuryaKumar Yadav");
		s.selectByVisibleText("Shubman Gill");
		s.selectByVisibleText("Yuzvendra Chahal");
		s.selectByVisibleText("Sanju Samson");
		
		WebElement dropdown2 = driver.findElement(By.id("dropdown2"));
		Select s1 = new Select(dropdown2);
		List<WebElement> players =  s1.getOptions();
		for(WebElement player:players) {
			System.out.println(player.getText());
		}
		
		
	}

}
