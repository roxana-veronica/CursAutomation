package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
	
WebDriver driver;
	
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
	}	



private By clickAlert1 = By.id("alertButton"); 
private By clickAlert2 = By.id("timerAlertButton");
private By clickAlert3 = By.id("confirmButton");
private By clickAlert4 = By.id("promtButton");



	public void clickAlert1() {
		driver.findElement(clickAlert1).click();
	}
	
	public void clickAlert2() {
		driver.findElement(clickAlert2).click();
	}
	
	public void clickAlert3() {
		driver.findElement(clickAlert3).click();
	}
	
	public void clickAlert4() {
		driver.findElement(clickAlert4).click();
	}
}
