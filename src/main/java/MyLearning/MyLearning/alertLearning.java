package MyLearning.MyLearning;

import java.util.List;

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
public class alertLearning {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String ranstr=RandomString.make(5);
		driver.findElement(By.id("name")).sendKeys(ranstr);
		driver.findElement(By.id("alertbtn")).click();
		String alerttxt=driver.switchTo().alert().getText();
		String[] content=alerttxt.split(",");
		if(content[0].contains(ranstr)) {
			System.out.println(ranstr+ " is matched string");
			driver.switchTo().alert().accept();
		}
		else {
			System.out.println("string not matching");
		}
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
	}
}
