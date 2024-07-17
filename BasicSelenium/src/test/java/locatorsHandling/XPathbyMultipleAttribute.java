package locatorsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbyMultipleAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//tagName[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']
//		driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']")).sendKeys("Iphone");
		
		//tagName[@AttributeName='AttributeValue' or @AttributeName='AttributeValue']
//		driver.findElement(By.xpath("//input[@type='submit' or @value='G']")).click();
		
		//tagName[@AttributeName='AttributeValue' or text()='textValue']
//		driver.findElement(By.xpath("//a[@class='nav-a  ' and text()=\"Today's Deals\"]")).click();
		
		//tagName[contains(@AttributeName,'AttributeValue') and @AttributeName='AttributeValue']
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search') and @id='twotabsearchtextbox']")).sendKeys("Iphone");
		
		//tagName[contains(@AttributeName,'AttributeValue') and contains(@AttributeName,'AttributeValue')]
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit') and contains(@type,'submit')]")).click();
		
		//tagName[contains(@AttributeName,'AttributeValue') or text()='TextValue']
		driver.findElement(By.xpath("//a[contains(@class,'nav-a') and text()='Amazon miniTV']")).click();
				
		
		
	}

}
