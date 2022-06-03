package MyLearning.MyLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class httpsCertificateLearn {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		//accept private https cert
		option.setAcceptInsecureCerts(true);
		//proxy setting 
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipadress:port");
		option.setCapability("Proxy", proxy);
		
		//initiate browser now
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}
}
