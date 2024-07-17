package HandlingDropdowns.Assessments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

//2 - Navigate to demo web shop, perform login, click on books link, Select option "Price:low to high" in "Sort by" dropdown and capture the screen shot.

public class DemoWebShopEx1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Login DemoWebShop
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("aarakavi27@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ragavi@DemoWeb");
		driver.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(1000);
		
		//Navigate to Books and select dropdown
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Price: Low to High");
		
		//Take Screenshot of dropdown
		Thread.sleep(2000);
		WebElement dropdownImage = driver.findElement(By.xpath("//div[@class='product-sorting']"));   //Finding dropdown again to avoid stale element exception
		File src =  dropdownImage.getScreenshotAs(OutputType.FILE);
		File targ = new File("./Screenshots/DemoWebShopDropdown.png");
		FileHandler.copy(src, targ);
		
		
		
	}

}
