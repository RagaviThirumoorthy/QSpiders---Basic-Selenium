package PopUpsHandling;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopupEg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		//Access the calendar
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.YEAR, 1);
		//Get date
		Date date = cal.getTime();
		
		//Format the date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String modDate = sdf.format(date);
		System.out.println(modDate);		
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		WebElement calendarEle = driver.findElement(By.id("datepicker"));
		calendarEle.click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();  //Simple method 
		calendarEle.sendKeys(modDate,Keys.ESCAPE);
		
		Thread.sleep(3000);
		driver.quit();

	}

}

//To select other dates, we have to locate the date using Findelement and click it. Other method is shown up there.
