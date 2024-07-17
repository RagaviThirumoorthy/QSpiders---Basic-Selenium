package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdownEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='SelectYourHero']"));
		
//		Step 1: Create object for select class
		Select select = new Select(dropdown);
		
//		Step 2: Select option by index
		select.selectByIndex(2);
		Thread.sleep(2000);
	
//		Step 3: Select option by value
		select.selectByValue("shan");
		Thread.sleep(2000);
		
//		Step 4: Select option by visible text
		select.selectByVisibleText(" Hrithik Roshan");
		Thread.sleep(2000);
	}

}


// https://demowebshop.tricentis.com/ 
//1 - Navigate to google, enter your name, clear and enter selenium, capture the screen shot of entire web page. Don’t use clear(). 
//2 - Navigate to demo web shop, perform login, click on books link, sort by low to high and capture the screen shot.
