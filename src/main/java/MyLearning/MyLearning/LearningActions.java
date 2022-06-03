package MyLearning.MyLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class LearningActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("shampoo").build().perform();

		Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("div.s-suggestion-container")).size());
		List<WebElement> a1 = driver.findElements(By.cssSelector("div.s-suggestion-container"));
		for (WebElement opt : a1) {
			if (opt.getText().equalsIgnoreCase("shampoo bar")) {
				opt.click();
				break;
			}
		}
	}
}
