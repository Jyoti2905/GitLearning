package MyLearning.MyLearning;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class brokenLink {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert as=new SoftAssert();
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int rescode=con.getResponseCode();
			System.out.println(rescode);
			String linkname=link.getText();
			
			as.assertTrue(rescode<400, "link of the page " +linkname+ " is broken with repsonse code: " +rescode);
					
			//or we can use if condition below to obtain same result
			/* if(rescode>400 && rescode<500) {
								System.out.println("link of the page " +linkname+ "is broken with repsonse code: " +rescode);
		} */
			 as.assertAll();
					}
		
		
	}}
