package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.flipkart.com/");
//		Method 1: sendkeys()
//		driver.findElement(By.name("q")).sendKeys("IPhone");
//		Method 2: click()
//		driver.findElement(By.className("_2iLD__")).click();
		
		
//		driver.get("https://www.flipkart.com/");
//		WebElement search = driver.findElement(By.cssSelector(".Pke_EE"));
//		search.sendKeys("Bluetooth");
//		Method 3: submit()
//		search.submit();
		
//		Method 4: clear()		
/*		driver.get("https://www.saucedemo.com/");
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("Ragavi");
		Thread.sleep(1000);
		UserName.clear();
		Thread.sleep(1000);
		UserName.sendKeys("standard_user"); */
		
//		Method 5: getLocation()
/*      driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY()); 
		
//		Method 6: getSize()
		System.out.println(element.getSize().getHeight());
		System.out.println(element.getSize().getWidth());
		
//		Method 7: getRect()
		System.out.println(element.getRect().getX());
		System.out.println(element.getRect().getY());
		System.out.println(element.getRect().getHeight());
		System.out.println(element.getRect().getWidth());  */
		
//		Method 8: isEnabled()
	/*	driver.get("https://www.amazon.in/");
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchBox.isEnabled()) {
			searchBox.sendKeys("Nike");
		}else {
			System.out.println("Not enabled");
		}  */
		
//		Method 9: isDisplayed()
	/*	driver.get("https://www.facebook.com/");
		WebElement fbLogo =  driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		if(fbLogo.isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
		radioButton.click();
		
//		Method 10: isSelected()
		if(radioButton.isSelected()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		} */
		
//		Method 11: getAttribute()
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement gifts = driver.findElement(By.xpath("//a[text()='Gift Ideas	']"));
		System.out.println(gifts.getAttribute("data-csa-c-content-id"));
		System.out.println(gifts.getAttribute("class"));
		
//		Method 12: getDomAttribute()
		System.out.println(gifts.getDomAttribute("href"));
		
//		Method 13: getDomProperty()
		System.out.println(gifts.getDomProperty("text"));
		System.out.println(gifts.getDomProperty("baseURI"));
		
//		Method 14: getAccessibleName()  -->What name appears on the web page
		System.out.println(gifts.getAccessibleName());
		System.out.println(searchBox.getAccessibleName());
		
//		Method 15: getAriaRole() -->Tells you what type of element it is
		System.out.println(gifts.getAriaRole());
		System.out.println(searchBox.getAriaRole());
		
//		Method 16: getTagName()
		System.out.println(gifts.getTagName());
		System.out.println(searchBox.getTagName());
		
//		Method 17: getText()
	/*	searchBox.sendKeys("Puma");
		searchBox.submit();
		String shoeName = driver.findElement(By.xpath("//span[contains(text(),'Unisex-Adult')]")).getText();
		System.out.println(shoeName); */
		
//		Method 18: getCssValue()
		System.out.println(gifts.getCssValue("color"));
		System.out.println(gifts.getCssValue("font-size"));
		System.out.println(searchBox.getCssValue("position"));
		System.out.println(searchBox.getCssValue("direction"));
		
	}

}
