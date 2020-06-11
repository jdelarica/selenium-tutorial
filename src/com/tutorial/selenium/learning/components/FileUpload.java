package com.tutorial.selenium.learning.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");
								
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
								
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		// We can send keys:
		WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
		
		fileUploadField.sendKeys("C:\\Users\\jdelarica\\Documents\\00- Allianz\\01- CBS_MDDR\\imp az docs\\MDDR\\Docs\\TestDocument.pdf");
		
		driver.quit();
		
	}
}
