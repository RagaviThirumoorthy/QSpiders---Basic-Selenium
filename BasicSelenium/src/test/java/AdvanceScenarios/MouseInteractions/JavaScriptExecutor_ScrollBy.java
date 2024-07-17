package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Typecasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Down
		js.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(2000);
		//Up
		js.executeScript("window.scrollBy(0,-3000);");
		Thread.sleep(2000);
		
		driver.quit();

	}

}




