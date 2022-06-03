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
public class assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).click();
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.cssSelector(".ui-menu-item"));
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase("India")) {
				list.get(i).click();
				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
			}
		}
		
		/*
// window scroll bar and scroll bar within a table in webpage
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
// Table grid learning		
List<WebElement>list= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
int sum=0;
for(int i=0;i<list.size();i++) {
//System.out.println(Integer.parseInt(list.get(i).getText()));
 sum=sum+ Integer.parseInt(list.get(i).getText());
 System.out.println(sum);
}

int abc=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
System.out.println(abc);
Assert.assertEquals(sum, abc);
/*
		System.out
				.println("size of checkbox is " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
		//click the checkbox n pick the checkbox value 
		for (int i = 0; i < driver.findElements(By.cssSelector("input[type='checkbox']")).size(); i++)
		{
			driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();
			String opt=driver.findElements(By.xpath("//*[@id='checkbox-example']/fieldset/label")).get(i).getText();
			System.out.println("checkbox value is "+opt);
			
		//same selected checkbox value should be selected in dropdown	
			Select id=new Select(driver.findElement(By.id("dropdown-class-example")));
			id.selectByVisibleText(opt);
			
		// same checkbox value should be passed in textbox 
			driver.findElement(By.name("enter-name")).sendKeys(opt);
			driver.findElement(By.cssSelector("input[value='Alert']")).click();
			String alerttext=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			if(alerttext.contains(opt)) {
				System.out.println("sucess");
			}
			else {
				System.out.println("Fail");
			}
		
		}	*/
	}
}
