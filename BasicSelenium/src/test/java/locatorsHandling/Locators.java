package locatorsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.saucedemo.com/");
//		
//		//id
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//name
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.name("field-keywords")).sendKeys("Vivo",Keys.ENTER);
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//className
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.className("submit-button btn_action")).click();
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.name("q")).sendKeys("Chair");
//		driver.findElement(By.className("_2iLD__")).click();
//		driver.findElement(By.linkText("Grocery")).click();
		
		//Linktext
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Amazon miniTV")).click();
		
		//Partial Linktext
		driver.findElement(By.partialLinkText("Web Ser")).click();
		
	
	}

}
