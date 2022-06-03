package MyLearning.MyLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//check-box learning
		System.out.println("size of checkbox is "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	//Radio button learning
	System.out.println(driver.findElement(By.cssSelector("input[type='radio']")).getSize());
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());

	//validate whether the return date calendar is enabled or disabled.
   String style= driver.findElement(By.id("Div1")).getAttribute("style"); // id of return calendar section
if(style.contains("opacity: 1")) {
	System.out.println("return date Calendar is enabled");
	Assert.assertTrue(true);
}
else {
	System.out.println("return date Calendar is enabled");
	Assert.assertFalse(false);
}
		//auto suggest drop-down selecting India on ind typing
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
	}
}
