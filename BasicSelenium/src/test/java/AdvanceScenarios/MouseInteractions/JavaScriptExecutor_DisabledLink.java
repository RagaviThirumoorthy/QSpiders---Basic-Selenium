package AdvanceScenarios.MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_DisabledLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='jdk-8u411-linux-aarch64.rpm']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);",link);
		link.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).click();
		WebElement disabledLink = driver.findElement(By.linkText("Download jdk-8u411-linux-aarch64.rpm"));
		js.executeScript("arguments[0].click();", disabledLink);
		Thread.sleep(5000);
		
		driver.quit();
	}

}
