package com.tutorial.selenium.learning.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class SwitchToAlert {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
						
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
						
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement alertBtn = driver.findElement(By.id("alert-button"));
		alertBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		// Press ok and close the alert
		alert.accept();
		
		driver.quit();

	}

}
