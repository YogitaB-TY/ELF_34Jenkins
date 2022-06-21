package practiceSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JS_ScrollTest {
	
	@Test
	public void TC() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.get("http://demowebshop.tricentis.com/");
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
		 * js.executeScript("window.scrollTo(670,959);");
		 */
		driver.get("https://www.zomato.com/");
		WebElement scrollEle=driver.findElement(By.xpath("//h5[contains(text(),'Marathahalli')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
		

	}

}
