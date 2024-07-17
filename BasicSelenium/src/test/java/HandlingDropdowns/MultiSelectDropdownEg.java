package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='SelectYourCar']"));
		Select s = new Select(dropdown);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("mercedes");
		Thread.sleep(2000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByVisibleText("Mercedes");
		Thread.sleep(2000);
		s.deselectByValue("audi");
		
	}

}
