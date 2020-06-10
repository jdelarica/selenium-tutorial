package com.tutorial.selenium.learning.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyboardAndMouseInput {

	public static void main(String[] args) {
		
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
		
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/autocomplete");
				
		WebElement username = driver.findElement(By.id("name"));
		username.click();
		username.sendKeys("test");
				
		WebElement signinbutton = driver.findElement(By.id("button"));
		signinbutton.click();
				
		driver.quit();

		
		driver.quit();

	}

}
