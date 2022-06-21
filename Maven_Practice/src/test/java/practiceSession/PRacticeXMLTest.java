package practiceSession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PRacticeXMLTest {
	
	@Test
	public void TC() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	
	Actions action=new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_UP).perform();
	}

}
