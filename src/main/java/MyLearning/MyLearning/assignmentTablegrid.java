package MyLearning.MyLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class assignmentTablegrid {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
// Table grid learning		
WebElement table= driver.findElement(By.cssSelector(".table-display"));
int rowcount=table.findElements(By.tagName("tr")).size();
int columncount=table.findElements(By.tagName("th")).size();

System.out.println("number of rows: " + rowcount + " number of column " +columncount);

for(int i=0;i<rowcount;i++) {
	if(i==2) {
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(i).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}
}
	}
}
