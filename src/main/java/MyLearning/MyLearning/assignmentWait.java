package MyLearning.MyLearning;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class assignmentWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> It=windows.iterator();
		String parent=It.next();
		String childwin=It.next();
		driver.switchTo().window(childwin);

String text=driver.findElement(By.xpath("//span[contains(text(),'World class')]")).getText().split("Protractor")[1].trim().split("Appium")[0];
		System.out.println(text);
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.name("password")).sendKeys(text);
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		//Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		Select profile=new Select(driver.findElement(By.cssSelector("select.form-control")));
		profile.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		} 
	}
}
