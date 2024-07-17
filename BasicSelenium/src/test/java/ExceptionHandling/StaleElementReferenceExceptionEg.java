package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementReferenceExceptionEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		if(driver.getTitle().equals("Demo Web Shop. Books")) {
			System.out.println("The Book page is displayed");
		}else {
			System.out.println("The Book page is not displayed");
		}
		
		WebElement dropdown =  driver.findElement(By.id("products-orderby"));
		Select s = new Select(dropdown);
		
		for(int i=0;i<=5;i++) {
			System.out.println("i-->"+i);
			s.selectByIndex(i);
			Thread.sleep(2000);
			//Reinitialize objects to avoid stale element reference exception
			dropdown =  driver.findElement(By.id("products-orderby"));
			s = new Select(dropdown);
		}
		
	}

}
