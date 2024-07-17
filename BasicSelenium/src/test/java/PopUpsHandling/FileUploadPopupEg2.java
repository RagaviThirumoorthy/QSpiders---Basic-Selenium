package PopUpsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopupEg2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		Actions act = new Actions(driver);
		act.scrollToElement(aboutUs).perform();
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		//Select
		StringSelection s = new StringSelection("E:\\Career\\Resume\\Automation\\Ragavi_QAEngineer_Resume.pdf");
		//Copy
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();		
		cb.setContents(s, null);
		//Paste
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(8000);
		
		driver.quit();
		
	}

}
