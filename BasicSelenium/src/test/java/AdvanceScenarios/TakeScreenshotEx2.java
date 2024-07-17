package AdvanceScenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
//		Step 1: Locate the WebElement
		WebElement profileIcon =  driver.findElement(By.xpath("//span[text()='Profile']/../.."));
//		Step 2: Take screenshot and store it in Source file
		File src =  profileIcon.getScreenshotAs(OutputType.FILE);
//		Step 3: Create a Target file and folder
		File targ = new File("./Screenshots/MyntraIcon.png");
//		Step 4: Copy the source file to target file
		FileHandler.copy(src, targ);
		
	}

}



//Task 2: Navigate to Instagram and capture the element "Login with facebook"
