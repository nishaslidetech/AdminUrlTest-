package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class URL_Test extends Set {
	WebDriverWait wait = new WebDriverWait(driver,10);
       JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on sign up page cd$")
	public void user_is_already_on_sign_up_page_cd() throws InterruptedException  {
	    
		driver.get("https://test2.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement.size() != 0) {
                               Assert.fail("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }
		Thread.sleep(3000);
		
	        driver.get("https://test1.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement1.size() != 0) {
                               Assert.fail("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }
		
	/*driver.get("https://test-admin.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement2 = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement2.size() != 0) {
                               System.out.println("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }*/
		
		Thread.sleep(3000);
		
	       driver.get("https://www.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement3 = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement3.size() != 0) {
                              Assert.fail("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }
		
		Thread.sleep(3000);
	       driver.get("https://www4.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement4 = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement4.size() != 0) {
                               Assert.fail("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }
		
		Thread.sleep(3000);
	        driver.get("https://www5.slideteam.net/adminer.php");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement5 = driver.findElements(By.xpath("//*[contains(text(),'Database')]"));

		if (dynamicElement5.size() != 0) {
                              Assert.fail("Element is present");
                                } else {
                                  System.out.println("Element is not present");
                                  }
	
		
	}
}
