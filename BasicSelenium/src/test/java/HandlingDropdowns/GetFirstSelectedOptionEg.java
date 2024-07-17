package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("BMW");
		Thread.sleep(2000);
		s.selectByVisibleText("Jeep");
		Thread.sleep(2000);
		
		WebElement firstSelected = 	s.getFirstSelectedOption();	
		System.out.println(firstSelected.getText());
		
		driver.quit();
		
		
		
		
	}

}
