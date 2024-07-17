package locatorsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXPathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. AbsoluteXPath
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		
//		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/form/div[1]/input")).sendKeys("standard_user");
//		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/form/div[2]/input")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/form/input")).click();
		
		//2. getText()
		driver.get("https://www.amazon.in/");
		
		
		
	}

}
