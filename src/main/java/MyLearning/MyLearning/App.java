package MyLearning.MyLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
       	WebDriver driver=new ChromeDriver();
    	driver.get("http://www.google.com");
    	String title=driver.getTitle();
    	System.out.println(driver.getTitle());
    }
}
