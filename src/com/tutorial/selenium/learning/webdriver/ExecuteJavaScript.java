package com.tutorial.selenium.learning.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ExecuteJavaScript {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
						
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
						
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/modal");
		
		// The modalbutton will be clicked.
		WebElement modalBtn = driver.findElement(By.id("modal-button"));
		modalBtn.click();
		
		WebElement closeBtn = driver.findElement(By.id("close-button"));
		
		// Once the modal is open, the JS executor will execute a simple script to press the close button.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closeBtn);
		
		
		driver.quit();

	}

}
