package MyLearning.MyLearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class calendarHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://path2usa.com/travel-companions");
		//july 16
		driver.findElement(By.cssSelector("input[name='travel_date']")).click();
		Thread.sleep(2000);
	while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("July")) {
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}

		List<WebElement> days=driver.findElements(By.cssSelector(".day"));
		for(int i=0;i<days.size();i++) {
		
		if(days.get(i).getText().contains("16")) {

			days.get(i).click();
		}
		}
	}
}
