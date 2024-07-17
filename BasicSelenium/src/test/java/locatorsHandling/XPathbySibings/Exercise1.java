package locatorsHandling.XPathbySibings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the offer price of shoes in Amazon

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Puma");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		String offer = driver.findElement(By.xpath("//*[contains(.,'Unisex-Adult')]/../../../following-sibling::div[2]//span[@class='a-letter-space']/following-sibling::span")).getText();	
		System.out.println(offer);	
				
	}

}
