package com.tutorial.selenium.learning.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
								
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
								
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/radiobutton");

		// Automate Radio button 1 based on id:
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		
		// Automate Radio button 2 based on value:
		WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value=option2]"));
		radiobutton2.click();
		
		// Automate Radio button 3 based on xPath:
		WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radiobutton3.click();
		
		driver.quit();
		
	}

}
