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

## 2. USING WEBDRIVER

```java
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class MainScript {

public static void main(String[] args) {
// Set property for webdriver.chrome.driver to be the location to the local download of chromedriver
System.setProperty("webdriver.chrome.driver", "PathTochromedriver.exe");

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
SwitchTo method allows the driver to switch from windows and offers:<br>
* Switch to window:
```java
driver.switchTo().window("windowName");
```
* Switch to frame:
```java
driver.switchTo().frame("frameName");
```
* Switch to a popup alert:
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


## 3. USING ADVANCED LOCATORS
## 3.1. Combine multiple CSS attributes
This can be necessary when the web page under test has many of the same type of elements, and the css selector needs to describe the unique element and there are no other good options.

#### TAG AND CLASS
```html
<input class=”q” type=”text”>
```
I could simply use the class name, but maybe the class is also used somewhere else and we want to be more specific and use the tag name as well:
```java
driver.findElement(By.cssSelector("input.q"));
```
#### TAG AND ID
```html
<input id=”q” type=”text”>
```
```java
driver.findElement(By.cssSelector("input#q"));
```
#### TAG AND ATTRIBUTE
```html
<input type= "radio" value=”radiobutton”>
```
In this case, I can find the radio button either based on its type or its value. <br>
* By its type:
```java
driver.findElement(By.cssSelector("input[type=’radio’]"));
```
* By its value:
```java
driver.findElement(By.cssSelector("input[value=’radio button’]"));
```
#### CLASS AND CLASS
We can also define the css selector with multiple classes. It's common to see an HTML element that has many classes.
Let's say we have the following HTML to define multiple buttons on the page:
```html
<button type="button" class="btn btn-lg btn-primary">
<button type="button" class="btn btn-lg btn-success">
<button type="button" class="btn btn-lg btn-info">
```
They look pretty similar, the only difference is on their class. To define a css selector for the success button:
```java
driver.findElement(By.cssSelector(".btn.btn-lg.bn-success"));
```

## 3.2. Text Matching
#### BY VALUE
```java
driver.findElement(By.cssSelector("<tagname>[type=’<value>’]"));
```
#### WILDCARD
* Prefix
```html
<div id=”textField_randomId”>
```
```java
driver.findElement(By.cssSelector("<div>[id^=’textField’]"));
```
* Suffix
```html
<div id=”randomId_textField”>
```
```java
driver.findElement(By.cssSelector("<div>[id$=’textField’]"));
```
* Substring
```html
<div id=”123_textField_randomId”>
```
```java
driver.findElement(By.cssSelector("<div>[id*=’textField’]"));
```

* Exact Match
```html
<div id=”textField”>
```
```java
driver.findElement(By.cssSelector("<div>[id=‘textField’]"));
```

#### CHILD
Node directly under another node. 
```html
<div id="parent">
  <a id="child" href="/child">Child</a>
</div>
```
We have an ```<a>``` tag within a ```<div>``` tag:
```java
driver.findElement(By.cssSelector("div#parent a"));
```
#### NTH-CHILD
Used when there are multiple nodes at the same level, under another node. Particularly helpful when there is a list of elements and we want to find one element within the list:

```html
<ul id="list">
  <li>One</li>
  <li>Two</li>
  <li>Three</li>
</ul>
```

```java
driver.findElement(By.cssSelector("#list li:nth-child(n)"));
driver.findElement(By.cssSelector("#list li:nth-child(n=two)"));
```

## 4. INTERACTING WITH COMPONENTS
### [4.1. Radio button and checkbox](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/components/RadioButton.java)
### [4.2. Date picker](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/components/DatePicker.java)
### [4.3. Dropdown menu](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/components/Dropdown.java)
### [4.4. File upload](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/components/FileUpload.java)

## 5. SYNZHRONIZATION ISSUES
Tests usually run really fast, but sometimes it takes a moment for pages to load, actions to finish, components to appear, etc. <br>
* Browser drivers operate at different speeds. Chrome and Decko are the fastest, and the rest are a bit slower. 
* While the number of tests increases, there is a discrepancy between running tests in a local machine or runnin in a remote/virtual machine.
* Network speed and connectivity can be another factor that makes a huge difference.
* Pages can be slow to render.

Synchronization will always become an issue at some point with Selenium WebDriver tests. How to identify a Sync issue? <br>
* The test gets stuck at a specific step.
* "No Such Element Exception" - 
	* The element could not be found by the locator specified at the time of searching for it.
	* THe element is not visible or present on the page at the time of searching for it. >> Adding Waits

If the locator has been correctly specified, the solution is adding waits so it slows the test until element becomes available.

## [5.1. Implicit waits](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/synchronization/ImplicitWait.java)
It tells webdriver to wait for a specified amount of time before throwing a "No Such Element Exception". The default time is "0".
They don't depend on a certain element state but on a specified time.
```java
import java.util.concurrent.TimeUnit;
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
```
## [5.2. Explicit waits](https://github.com/jdelarica/selenium-tutorial/blob/master/src/com/tutorial/selenium/learning/synchronization/ExplicitWait.java)
It waits for a specified amount of time for a certain condition to be true. If the condition is not met in the specified time, an exception is thrown. <br>
The explicit wait is intelligent: It gives better options than implicit waits, allows more flexibility since it will wait for dynamically located elements. <br>

```java
WebDriverWait wait = new WebDriverWait(driber,10);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element"));
```

Pros: The allow flexibility to wait for an element to be in a specific condition and it will pull the condition to be true every 500ms and it won't take up any unnecessary time.



