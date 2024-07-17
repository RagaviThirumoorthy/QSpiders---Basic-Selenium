package findElementsHandling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IPhone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement name: names) {
			System.out.println(name.getText());
		}
	}

}
