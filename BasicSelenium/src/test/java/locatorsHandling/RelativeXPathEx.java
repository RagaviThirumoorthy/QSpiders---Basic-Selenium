package locatorsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		// SYNTAX 1: XPath by Attribute
		//tagName[@attributeName='attributeValue']
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		
		//SYNTAX 2: XPath by visibleText
		//tagName[text()='visible text']
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bluetooth",Keys.ENTER);
//		String name = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
//		System.out.println(name);
		
		//Exercise 1
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IPhone");
//		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
//		String iPhoneName = driver.findElement(By.xpath("//div[@class='KzDlHZ']")).getText();
//		String price = driver.findElement(By.xpath("//div[@class='Nx9bqj _4b5DiR']")).getText();
//		System.out.println(iPhoneName);
//		System.out.println(price);
		
		
//		bigbasket-->Search Mangoes-->Print the name and price of second mango
//		driver.get("https://www.bigbasket.com/");
//		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Mangoes",Keys.ENTER);
////		String mangoName = driver.findElement(By.xpath("(//div[@class='break-words h-10 w-full'])[2]/h3")).getText();
////		String mangoPrice = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi'])[2]")).getText();
//
//		String mangoName = driver.findElement(By.xpath("//h3[text()='Lalbagh Mango - Sindhura']")).getText();
//		String mangoPrice = driver.findElement(By.xpath("//span[text()='₹88']")).getText();
//		System.out.println(mangoName);
//		System.out.println(mangoPrice);
		
		
		//SYNTAX 3: XPath by contains Attribute
		//tagName[contains(@AttributeName, 'AttributeValue')]
//		driver.get("https://www.amazon.in/");	
//		driver.findElement(By.xpath("//input[contains(@aria-label,'Search')]")).sendKeys("Bluetooth");
//		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit')]")).click();
//		
//		//SYNTAX 4: XPath by contains text
//		//tagName[contains(text(),'textValue')]
//		driver.findElement(By.xpath("//a[contains(text(),'Fash')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Jewel')]")).click();
		
		//Exercise 2
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Puma");
//		driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products')]")).click();
//		Thread.sleep(1000);
//		
//		String shoeName = driver.findElement(By.xpath("//a[text()='Enzo Stridance IDP Running Shoes For Men']")).getText();
//		String shoePrice = driver.findElement(By.xpath("//div[text()='₹1,924']")).getText();
//		String shoeDiscount = driver.findElement(By.xpath("//span[contains(text(),'65%')]")).getText();
//		
//		System.out.println(shoeName);
//		System.out.println(shoePrice);
//		System.out.println(shoeDiscount);
		
		//Exercise 3
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("IPhone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement name: names) {
			System.out.println(name.getText());
		}
		
		
		
	}

}
