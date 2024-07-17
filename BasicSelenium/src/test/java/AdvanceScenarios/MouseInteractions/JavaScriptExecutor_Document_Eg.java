package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Document_Eg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('email')[0].value='aarakavi27@gmail.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByName('Password')[0].value='Ragavi@DemoWeb';");
		Thread.sleep(2000);
//		js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click();");
		
		WebElement login = driver.findElement(By.cssSelector(".login-button"));
		js.executeScript("arguments[0].click();",login);
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
