package com.tutorial.selenium.learning.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
		
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/autocomplete");
				
		WebElement autocompletefield = driver.findElement(By.id("autocomplete"));
		autocompletefield.sendKeys("208 East Broadway Road Tempe");
		
		// It will check if the condition is true every 500 ms up until 10 s:
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		
		autocompleteResult.click();
		
		driver.quit();
		
	}

}
