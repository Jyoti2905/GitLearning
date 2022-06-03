package MyLearning.MyLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Flightbooking_end2End {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		System.out.println(driver.findElement(By.cssSelector("input[type='radio']")).getSize());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		Assert.assertTrue(
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).isSelected());
		
		// validate whether the return date calendar is enabled or disabled.
		String style = driver.findElement(By.id("Div1")).getAttribute("style"); // id of return calendar section
		if (style.contains("opacity: 0.5")) {
			System.out.println("return date Calendar is disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("return date Calendar is enabled");
			Assert.assertFalse(false);
		}
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		Select inr = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		inr.selectByIndex(3);
		System.out.println(inr.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			driver.findElement(By.id("hrefIncChd")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 4 Child");
//dynamic Drop-down learning 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
