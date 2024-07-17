package HandlingDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		
		Select s = new Select(dropdown);
		s.selectByValue("Volks");
		Thread.sleep(2000);
		s.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		s.selectByValue("jaguar");
		Thread.sleep(2000);
			
		//getAllSelectedOptions
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		//isMultiple()
		if(s.isMultiple()) {
			System.out.println("It's a Multi select dropdown");
		}else {
			System.out.println("It's a Single select dropdown");
		}
		
		
		
		driver.quit();
	}

}


 

