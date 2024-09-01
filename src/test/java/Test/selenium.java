package Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium{

	WebDriver driver;
		@Before
		public void before() throws Throwable {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
		@Test
		public void test() throws Exception {
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		}
		
		@After
		public void After() throws Exception {
			Thread.sleep(2000);
			driver.quit();
		}
		
		
		
		
	
	
	
}