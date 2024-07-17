package locatorsHandling.XPathbySibings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbySiblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//FOLLOWING SIBLING syntax
		
		//RRR to 20Cr
		//*[.='RRR']/following-sibling::td
		
		//1 to 25Cr
		//*[.='1']/../following-sibling::tr[1]/td[3]
		//*[.='1']/../following-sibling::*[1]/*[3]
//		System.out.println(driver.findElement(By.xpath("//*[.='1']/../following-sibling::tr[1]/td[3]")).getText());
		
//		Exercise 1:
//		Print the Phone price without the price in path
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.name("q")).sendKeys("IPhone");
//		driver.findElement(By.className("_2iLD__")).click();
//		String phonePrice = driver.findElement(By.xpath("//*[.='Apple iPhone 14 Plus (Starlight, 128 GB)']/../following-sibling::div/div/div[@class='hl05eU']/div[1]")).getText();
		//*[.='Apple iPhone 14 Plus (Starlight, 128 GB)']/../following-sibling::div//div[@class='Nx9bqj _4b5DiR']
//		/-Parent to immediate child  //-Parent to any child
//		System.out.println(phonePrice);
		
		
		
		
		//PRECEDING SIBLING Syntax
		
//		//td[text()='KGF2']/preceding-sibling::td
//		//td[text()='20cr']/../preceding-sibling::tr[2]/td[2]
		
		
		
		
	}

}
