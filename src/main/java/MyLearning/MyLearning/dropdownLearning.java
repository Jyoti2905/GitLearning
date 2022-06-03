package MyLearning.MyLearning;

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
public class dropdownLearning 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
       	WebDriver driver=new ChromeDriver();
       	driver.manage().window().maximize();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise");
    	String title=driver.getTitle();
    	System.out.println(driver.getTitle());
    	Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
    	
    	Select inr=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
    			inr.selectByIndex(3);
    	System.out.println(inr.getFirstSelectedOption().getText());
    	
    	driver.findElement(By.id("divpaxinfo")).click();
    	Thread.sleep(2000);
    	
    	for(int i=0;i<4;i++) {
    	driver.findElement(By.id("hrefIncAdt")).click();
    	driver.findElement(By.id("hrefIncChd")).click();
    	}
    	driver.findElement(By.id("btnclosepaxoption")).click();
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");
   //dynamic Drop-down learning 
    	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    	driver.findElement(By.xpath("//a[@value='BLR']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    	//driver.close();
    
    //Calendar learning
    driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-hover")).click();
    }
}
