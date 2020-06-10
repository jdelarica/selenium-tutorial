package com.tutorial.selenium.learning.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
						
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
						
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
		newTabBtn.click();
		
		String originalHandle = driver.getWindowHandle();
		
		// Switch to new tab
		for(String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		
		//Switch back to first tab
		driver.switchTo().window(originalHandle);
		
		driver.quit();

	}

}
