package locatorsHandling.XPathGroupByIndex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/QSpiders/Basic%20Selenium/4.%20Locators/Checkbox.html");
		
//		5th checkbox 
//		(//input[@type="checkbox"])[5]
//		2 and 4 checkbox
//		(//input[@type="checkbox"])[2] | (//input[@type="checkbox"])[4]
//		last checkbox
//		(//input[@type="checkbox"])[last()]
//		previous to last
//		(//input[@type="checkbox"])[last()-1]
//		place 3
//		(//input[@type="checkbox"])(position()=3)
//		less than or equal to 4
//		(//input[@type="checkbox"])(position()<=4)
//		checkbox in even posi
//		(//input[@type='checkbox'])[position() mod 2=0]
//		checkbox in odd posi
//		(//input[@type='checkbox'])[position() mod 2=1]
	}

}
