package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Case 1: In this case, you manually set the system property "webdriver.chrome.driver" to the path where your ChromeDriver executable is located. Then, you create an instance of ChromeDriver.
		
//		String key = "webdriver.chrome.driver";
//		String value = "./chromedriver.exe";
//		System.setProperty(key, value);
//		WebDriver driver = new ChromeDriver();
		
//		case 2: You use the WebDriverManager library to automatically download and manage the WebDriver executables. You call the setup() method for the ChromeDriver, and WebDriverManager takes care of downloading the appropriate version based on your system configuration.
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new ChromeDriver();
		
//		case 3:This approach assumes that the ChromeDriver executable is either available in your system's PATH or the default location recognized by Selenium.
		
		WebDriver driver = new ChromeDriver();
		
	}

}
