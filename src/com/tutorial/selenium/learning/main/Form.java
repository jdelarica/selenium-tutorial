package com.tutorial.selenium.learning.main;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tutorial.selenium.learning.pages.ConfirmationPage;
import com.tutorial.selenium.learning.pages.FormPage;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class Form {

	public static void main(String[] args) {
		// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Use the driver to visit a website
		driver.get("https://formy-project.herokuapp.com/form");
		FormPage formPage = new FormPage();
		formPage.SubmitForm(driver);
		
		// Confirming the behavior
		// The page will take some time to load
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForBanner(driver);
		
		// Add assertion to check values and behaviors with JUnit
		// To confirm that the text displayed is the same as the one I expect:
		assertEquals("The form was successfully submitted!", confirmationPage.getBannerText(driver));

		driver.quit();
	}

}
