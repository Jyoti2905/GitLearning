package MyLearning.MyLearning;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
public class Greencart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] vegnames = { "Cauliflower", "Beans", "Beetroot" };
		additems(driver, vegnames);
		applycoupons(driver);
	}

	public static void additems(WebDriver driver, String[] vegnames) {
		List<WebElement> listofveg = driver.findElements(By.cssSelector(".product-name"));
		for (int i = 0; i < listofveg.size(); i++) {
			String[] name = listofveg.get(i).getText().split("-");
			String formattext = name[0].trim();
			List custitems = Arrays.asList(vegnames);

			int j = 0;
			if (custitems.contains(formattext)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == vegnames.length) {
					break;
				}
			}
		}
	}
	
	public static void applycoupons(WebDriver driver) {
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		String promoinfo= driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		Assert.assertEquals(promoinfo, "Code applied ..!");
	}
}
