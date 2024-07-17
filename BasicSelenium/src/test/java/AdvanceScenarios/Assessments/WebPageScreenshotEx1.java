package AdvanceScenarios.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Task 1: Navigate to Facebook login page, Enter user name and password and take the screenshot

public class WebPageScreenshotEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ragavi2711@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kavikrrish27");
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/facebook.png");
		FileHandler.copy(src, targ);
				
		
	}

}
