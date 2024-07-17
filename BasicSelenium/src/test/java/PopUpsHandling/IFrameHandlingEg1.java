package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandlingEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		
		//Switching driver focus to the iframe
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("mce_0_ifr");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		driver.switchTo().frame(frameElement);
		
		//Inside Frame---->
		WebElement content = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		System.out.println(content.getText());
		
		//Outside Frame--->
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String mainMsg = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(mainMsg);
		
		driver.quit();

	}

}



