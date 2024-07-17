package HandlingDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropdownOptionsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='SelectYourCar']"));
		Select s = new Select(dropdown);
		//To fetch all the options
		List<WebElement> options = s.getOptions();
		for(WebElement option: options) {
			option.click();
			Thread.sleep(1000);
			System.out.println(option.getText());
		}
		
//		driver.close();
		
	}

}
