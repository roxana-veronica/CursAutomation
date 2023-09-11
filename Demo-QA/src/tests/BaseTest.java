package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AlertsPage;



public class BaseTest {
	
	static WebDriver driver;
	public static AlertsPage alertsPage;

	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
}
