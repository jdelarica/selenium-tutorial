package com.tutorial.selenium.learning.main;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class CleanTest {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/form");
		
		SubmitForm(driver);
				
		// Confirming the behavior
		// The page will take some time to load
		waitForBanner(driver);
		
		// Add assertion to check values and behaviors with JUnit
		// To confirm that the text displayed is the same as the one I expect:
		assertEquals("The form was successfully submitted!", getBannerText(driver));

		driver.quit();
	}

	
	public static void SubmitForm(WebDriver driver) {
		// Basic workflow
		driver.findElement(By.id("first-name")).sendKeys("Javier");
				
		driver.findElement(By.id("last-name")).sendKeys("de la Rica");
				
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
				
		driver.findElement(By.id("radio-button-2")).click();
				
		driver.findElement(By.id("checkbox-1")).click();
				
		driver.findElement(By.cssSelector("option[value='1']")).click();
			
		driver.findElement(By.id("datepicker")).sendKeys("11/06/2020");
			
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
				
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}
	
	public static void waitForBanner(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
	}
	
	public static String getBannerText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}
}
