package com.tutorial.selenium.learning.synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {
//Implicit wait for the autocomplete
	
	public static void main(String[] args) {
		
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
		
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/autocomplete");
				
		WebElement autocompletefield = driver.findElement(By.id("autocomplete"));
		autocompletefield.sendKeys("208 East Broadway Road Tempe");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
				
		WebElement autocompleteResult = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[3]"));
		autocompleteResult.click();
		
		driver.quit();
		
	}

}
