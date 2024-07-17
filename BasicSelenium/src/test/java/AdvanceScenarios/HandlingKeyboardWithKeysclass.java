package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardWithKeysclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	/*	driver.get("https://www.saucedemo.com/");
		//Case 1:
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);   //Used Keys class to handle keyboard inputs
		//Case 2:
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER); */
		
		
//		Exercise 1:
		driver.get("https://www.saucedemo.com/");
		WebElement UN = driver.findElement(By.id("user-name"));
		
		UN.sendKeys("standard_user");
		
		UN.sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(1000);
		UN.sendKeys(Keys.CONTROL,"c");
		
		WebElement pwd =  driver.findElement(By.id("password"));
		
		Thread.sleep(1000);
		pwd.sendKeys(Keys.CONTROL,"v");
		
		pwd.sendKeys(Keys.ENTER);
		
		
		
//		Disadvantages:
//		1. Cannot automate Alphabet letter
//		2. Can use only inside sendKeys() method
		
		
	}

}
