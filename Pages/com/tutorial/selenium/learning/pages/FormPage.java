package com.tutorial.selenium.learning.pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class FormPage {
	public static void SubmitForm(WebDriver driver) {
		// Basic workflow
		driver.findElement(By.id("first-name")).sendKeys("Javier");
				
		driver.findElement(By.id("last-name")).sendKeys("de la Rica");
				
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
				
		driver.findElement(By.id("radio-button-2")).click();
				
		driver.findElement(By.id("checkbox-1")).click();
				
		driver.findElement(By.cssSelector("option[value='1']")).click();
			
		driver.findElement(By.id("datepicker")).sendKeys("11/06/2020");
			
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
				
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}
}
