package webdriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("https://www.makemytrip.com/");
		
		//Fetch the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//Fetch the current url of the webpage
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Fetch the page source of the webpage
//		System.out.println(driver.getPageSource());
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(4000);
	
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//To position the browser
		driver.manage().window().setPosition(new Point(200, 200));
		Thread.sleep(5000);
		
		// Set the size of the browser window (width, height)
        Dimension size = new Dimension(1024, 768); // width and height
        driver.manage().window().setSize(size);
        
        
		//Close the current tab of the window
//		driver.close();
		
		//Close all the tabs opened in the window
		driver.quit();
		
		
	}

}
