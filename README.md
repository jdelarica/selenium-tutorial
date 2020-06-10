# SELENIUM

## 1. ENVIRONMENT SETUP
1. Download and install latest JDK version with JRE from:
[Java JDK](http://www.oracle.com/technetwork/java/javase/downloads.index.html) <br>

2. Download and install Eclipse from:
[Eclipse](https://www.eclipse.org/downloads/) <br>
3. Download latest version of selenium server from:
[Selenium](https://selenium-release.storage.googleapis.com/index.html) <br>
*We will only need Selenium server (zip) and Selenium server standalone (jar)

4. From Eclipse, we will create a new Java project and configure all the dependencies:
4.1. Right-click on project > Build Path > Configure Build Path
4.2. Libraries > Add External JARs > Add all downloaded JARs
4.3. Now we have two libraries under the Java project: JRE System Library (Default Java dependencies) and Referenced Libraries (downloaded Selenium dependencies)

## [2. USING WEBDRIVER](https://github.com/jdelarica/selenium-tutorial/tree/master/src/com/tutorial/selenium/learning/webdriver)

```java
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MainScript {

public static void main(String[] args) {
// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdelarica\\eclipse-workspace\\Selenium Drivers\\chromedriver.exe");

// Create new instance of ChromeDriver
WebDriver driver = new ChromeDriver();
		
// Use the driver to visit a website
driver.get("http://www.google.es");
	}

}
```

### [2.1. Keyboard and mouse input](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/KeyboardAndMouseInput.java)
### [2.2. Using autocomplete](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/Autocomplete.java)
### [2.3. Scroll to element](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/Scroll.java)
### [2.4. Switch to active window](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/SwitchToActiveWindow.java)
SwitchTo method allows the driver to switch from windows and offers:
Switch to window:
```java
driver.switchTo().window("windowName");
```
Switch to frame:
```java
driver.switchTo().frame("frameName");
```
Switch to a popup alert:
```java
driver.switchTo().alert();
```
### [2.5. Switch to alert](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/SwitchToAlert.java)
### [2.6. Executing JavaScript commands](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/ExecuteJavaScript.java)
1.	executeAsyncScript: executes an async piece of JS and it must explicitly signal it’s finished by invoking the provided callback.<br>
2.	executeScript: executes JS as the body of an anonymous function.<br>

Uses of JavascriptExecutor:<br>
*	When WebDriver fails to click on any element.<br>
*	To trigger actions on a page. <br>
*	To perform movement on a page (scroll, zoom…).<br>

### [2.7. Drag and drop](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/webdriver/DragAndDrop.java)



