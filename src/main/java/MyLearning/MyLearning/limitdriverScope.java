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
public class limitdriverScope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1. count of all links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. count of footer links 
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
	
	//3. footer first column links count
		WebElement footcolumn=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footcolumn.findElements(By.tagName("a")).size());
		
		//4. click on each link n check if its opening 
		for(int i=1;i<footcolumn.findElements(By.tagName("a")).size();i++) 
		{
			
			String keytest=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footcolumn.findElements(By.tagName("a")).get(i).sendKeys(keytest);
			Thread.sleep(5000L);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
		}
	}
}
