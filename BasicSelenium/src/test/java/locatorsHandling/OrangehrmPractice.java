package locatorsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.linkText("Book a Free Demo")).click();
		
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Ragavi T");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("ragavi@gmail.com");
		driver.findElement(By.cssSelector("input[name='CompanyName']")).sendKeys("Pinnacle");
		
//		WebElement dd = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(dd);
//		select.selectByVisibleText("India");
		
		driver.findElement(By.id("Form_getForm_Country")).click();
		driver.findElement(By.cssSelector("[value='India']")).click();
		
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9876543210");
		
		driver.findElement(By.id("#recaptcha-anchor")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		
		
	}

}
