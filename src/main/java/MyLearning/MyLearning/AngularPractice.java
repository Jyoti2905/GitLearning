package MyLearning.MyLearning;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class AngularPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Jyoti");
		
		String ranstr=RandomString.make(5).toString();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(ranstr+"@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(ranstr);
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		Select gender=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		gender.selectByIndex(1);
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("12");
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("12");
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("2000");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		String submitmsg=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
		if(submitmsg.contains("Success!")) {
			System.out.println("successfully submitted");
		}
		else {
			System.out.println("Not successfully submitted");
		}
		
	}

}
