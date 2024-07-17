package PopUpsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// protocol://username:password@url
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		String msg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		System.out.println(msg);
		
		driver.quit();
	}

}
