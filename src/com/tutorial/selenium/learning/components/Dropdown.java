package com.tutorial.selenium.learning.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
								
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
								
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
		dropdown.click();
		
		WebElement autocompleteOption = driver.findElement(By.id("autocomplete"));
		autocompleteOption.click();
		
		driver.quit();
		
	}

}
