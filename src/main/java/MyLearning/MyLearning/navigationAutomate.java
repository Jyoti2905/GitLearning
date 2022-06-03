package MyLearning.MyLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//a[contains(@href,'#/documents-request')]")).click();
		driver.navigate().back();
		//driver.navigate().forward();
	}

}
