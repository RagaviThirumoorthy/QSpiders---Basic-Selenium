package PopUpsHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class HandleSVGElements {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
				
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']/..")).click();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/GoogleSVG.png");
		FileHandler.copy(src, targ);
		Thread.sleep(3000);  
		
		driver.quit();

	}

}
