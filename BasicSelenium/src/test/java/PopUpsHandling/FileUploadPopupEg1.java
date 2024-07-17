package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopupEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		Actions act = new Actions(driver);
		act.scrollToElement(aboutUs).perform();
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\Career\\Resume\\Automation\\Ragavi_QAEngineer_Resume.pdf");  
		//sendkeys() method can be used to upload file only if the file upload element has a file = type attribute
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
