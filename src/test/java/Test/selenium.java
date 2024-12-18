package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenium{
	WebDriver driver;
	
	@Before
	public void before() throws Throwable {
	    WebDriverManager.chromedriver().setup();

	    
	    
	    driver = new ChromeDriver();
	    driver.get("https://www.google.in/");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
		
		@Test
		public void test() throws Throwable {
		    WebDriverManager.chromedriver().setup();

		    String title = driver.getTitle();
		    
		   System.out.println("title is:"+title);
		}
		
		
	
	
	
}