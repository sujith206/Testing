package Test;

import java.net.URI;
import java.util.List;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium{

	WebDriver driver;
	@Before
	public void before() throws Throwable {
	    WebDriverManager.chromedriver().setup();

	    

	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
		
		
		
		
		
	
	
	
}