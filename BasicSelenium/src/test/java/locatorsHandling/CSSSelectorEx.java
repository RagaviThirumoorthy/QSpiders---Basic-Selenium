package locatorsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("Earings",Keys.ENTER);
		
//		driver.get("https://www.saucedemo.com/");
//		//Syntax 1: [AttributeName = 'AtrributeValue']
//		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		
//		//Syntax 2: tagName[AttributeName = 'AtrributeValue']
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.cssSelector("img[alt='Travel']")).click();
		
		//Syntax 3: #id
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("#login-button")).click();
//		
//		//syntax 4: tagname#id
//		driver.findElement(By.cssSelector("input#login-button")).click();
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Summer dress for women");
//		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		//Syntax 5: .className
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector(".submit-button")).click();
		
		//Syntax 6: tagName.className
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
	}

}
