package MyLearning.MyLearning;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
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
public class Greencart2usingStreams {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.cssSelector("a[href*='offers']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//th/span[contains(text(),'Veg/fruit name')]")).click();
		
		List<WebElement> origin=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originvalue=origin.stream().map(s->s.getText()).collect(Collectors.toList());
	
		List<String> sortedval=originvalue.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originvalue.equals(sortedval));
	}
	
}
