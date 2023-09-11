package seedBlink;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterSecondaryOfferTest {
    public static void main(String[] args) {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "R:/workspace-curs/Demo-QA/src/res/chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
        

        // Access website
        driver.get("https://investors.seedblink.com/secondary/market");
        driver.manage().window().maximize();

        // Apply filter for Available Shares
        WebElement availableSharesFilter = driver.findElement(By.xpath(("//span[@class=\"MuiButton-label\"]/parent::button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text jss164 jss165\"]")));
        availableSharesFilter.click();  
        
       
        
     // Apply filter for Round Type
        WebElement roundTypeFilter = driver.findElement(By.xpath("//input[@name=\"financeRound\"]/preceding-sibling::div[@class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input\"]"));
        roundTypeFilter.click();
        WebElement roundTypeBridge = driver.findElement(By.xpath("//ul/li[@data-value=\"bridge\"]"));
        roundTypeBridge.click();
        //Click outside to close the drop-down (drop-down should automatically close, this should be raised as a bug and fixed)
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        bodyElement.click();
        
        // Apply filter for Domain
        WebElement domainFilter = driver.findElement(By.xpath("//input[@name=\"domain\"]/preceding-sibling::div[@class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input\"]"));
        domainFilter.click();
        WebElement domainFintech = driver.findElement(By.xpath("//div[@id='menu-domain']/div[3]/ul/li[@data-value=\"fintech\"]"));
        domainFintech.click();
        //Click outside to close the drop-down (drop-down should automatically close, this should be raised as a bug and fixed)
        //Also, the same bug occurs when using the search bar feature as well
        bodyElement.click();
        
        // Wait for the offers to be loaded
        
    

        // Get the number of offers available
        java.util.List<WebElement> offers = driver.findElements(By.className("MuiTableBody-root"));
        int numOffers = offers.size();

        
        //Print in console that there's a single offer available
        if (numOffers == 1) {
            System.out.println("One offer is available.");
        } else {
            System.out.println("Expected 1 offer, but found " + numOffers + " offers.");
        }

        // Close the browser
        driver.quit();
    }
}
