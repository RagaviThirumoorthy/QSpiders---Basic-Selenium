package AdvanceScenarios.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//2 - Navigate to instagram, Capture the screen shot of "login with facebook" web element.

public class WebElementScreenshotEx1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginWithFB =  driver.findElement(By.xpath("//button[@class=' _acan _acao _acas _aj1- _ap30']"));
		File src = loginWithFB.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/InstagramElement.png");
		FileHandler.copy(src, targ);
				
	}

}
