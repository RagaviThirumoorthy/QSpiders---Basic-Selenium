package HandlingDropdowns.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Click 'No thanks' popup and click cruise, select all dropdowns and click search

public class CruiseDropdownsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button#wzrk-cancel")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cruise')]")).click();
		Thread.sleep(2000);
		
		WebElement destinationDD = driver.findElement(By.xpath("//select[@name='place']"));
		Select s1 = new Select(destinationDD);
		s1.selectByVisibleText("Barcelona");
		Thread.sleep(1000);
		
		WebElement datesDD = driver.findElement(By.xpath("//select[@name='sailDate']"));
		Select s2 = new Select(datesDD);
		s2.selectByVisibleText("Sep-2024");
		Thread.sleep(1000);
		
		WebElement daysDD = driver.findElement(By.xpath("//select[@name='duration']"));
		Select s3 = new Select(daysDD);
		s3.selectByVisibleText("7 To 9 night(s)");
		Thread.sleep(1000);
		
		WebElement cruiseDD = driver.findElement(By.xpath("//select[@name='cruise']"));
		Select s4 = new Select(cruiseDD);
		s4.selectByVisibleText("Resort World Cruises");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
