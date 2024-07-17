package findElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluetooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(WebElement name: names) {
			System.out.println(name.getText());
			System.out.println();
		}
		
		for(WebElement price: prices) {
			System.out.println(price.getText());
			System.out.println();
		}
	}

}
