package com.tutorial.selenium.learning.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
						
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
						
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement img = driver.findElement(By.id("image"));
		WebElement box = driver.findElement(By.id("box"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(img, box).build().perform();
			
		driver.quit();

	}

}
