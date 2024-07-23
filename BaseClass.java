package org.stepdefi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	static WebDriver driver;
	static Actions nels;
	static Robot jims;
	static Select joe;
	static TakesScreenshot jos;
	static JavascriptExecutor nel;

	public static void browserLaunch() throws AWTException {
		driver=new ChromeDriver();
		nels=new Actions(driver);
		jims=new Robot();
		jos=(TakesScreenshot)driver;
		nel=(JavascriptExecutor)driver;
	}
	public static void UrlLaunch(String a) {
		driver.get(a);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void specialUrl(String c) {
		driver.navigate().to(c);
	}
	public static void moveToElement(WebElement a) {
		nels.moveToElement(a).perform();
	}
	public static void rightClk(WebElement c) {
		nels.contextClick(c).perform();
	}
	public static void doubleClk(WebElement d) {
		nels.doubleClick(d).perform();
	}
	public static void dragAndDrop(WebElement f,WebElement g) {
		nels.dragAndDrop(f, g).perform();
	}
	public static void tap() {
		jims.keyPress(KeyEvent.VK_TAB);
		jims.keyRelease(KeyEvent.VK_TAB);
	}
	public static void enter() {
		jims.keyPress(KeyEvent.VK_ENTER);
		jims.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void enterTextbox(WebElement f,String c) {
		f.sendKeys(c);
	}
	public static void clk(WebElement y) {
		y.click();
	}
	public static void selectByIndex(WebElement a,int s) {
		joe=new Select(a);
		joe.selectByIndex(s);
	}
	public static void selectByValue(WebElement b,String c) {
		joe=new Select(b);
		joe.selectByValue(c);
	}
	public static void selectByVisibleText(WebElement c,String d) {
		joe=new Select(c);
		joe.selectByVisibleText(d);
	}
	public static void deselectByIndex(WebElement g,int h) {
		joe=new Select(g);
		joe.deselectByIndex(h);
	}
	public static void deselectByVisibleText(WebElement h,String j) {
		joe=new Select(h);
		joe.deselectByVisibleText(j);
	}
	public static void deselectByValue(WebElement g,String y) {
		joe=new Select(g);
		joe.deselectByValue(y);
	}
	public static void deselectAll(WebElement d) {
		joe=new Select(d);
		joe.deselectAll();
	}
	public static void getfirstSelectedOptions(WebElement a) {
		joe=new Select(a);
		WebElement firstSelectedOption = joe.getFirstSelectedOption();
		System.out.println("First Selected Option : "+firstSelectedOption.getText());
	}
	public static void getAllSelectedOptions(WebElement c) {
		joe=new Select(c);
		List<WebElement> allSelectedOptions = joe.getAllSelectedOptions();
		System.out.println("Get All Selected Options : ");
		for (WebElement g : allSelectedOptions) {
			System.out.println(g.getText());
		}
	}
	public static void getOptions(WebElement h) {
		joe=new Select(h);
		List<WebElement> options = joe.getOptions();
		System.out.println("Get All Options Which is in the Dropdown : ");
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			joe.selectByIndex(i);
			System.out.println(webElement.getText());
		}
	}
	public static void isMultiple(WebElement a,int c,int d,int h) {
		joe=new Select(a);
		if (joe.isMultiple()) {
			joe.selectByIndex(c);
			joe.selectByIndex(d);
			joe.selectByIndex(h);
		} else {
			System.out.println("we can't able to select the multiple options ");
		}
		List<WebElement> allSelectedOptions = joe.getAllSelectedOptions();
		System.out.println("Selected By Using the isMultiple : ");
		for (WebElement cd : allSelectedOptions) {
			System.out.println(cd.getText());
		}
	}
	public static void TakesScreenshot() throws IOException {
		File screenshotAs = jos.getScreenshotAs(OutputType.FILE);
		File n=new File("G:\\java_Nelson\\BaseClass40\\Screenshot\\jos.png");
		FileUtils.copyFile(screenshotAs, n);
	}
	public static void framesIndex(int s) {
		driver.switchTo().frame(s);
	}
	public static void framesLocator(String a) {
		driver.switchTo().frame(a);
	}
	public static void framesWebElement(WebElement c) {
		driver.switchTo().frame(c);
	}
	public static void windowsHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>b=new ArrayList<>();
		b.addAll(windowHandles);
		String string = b.get(1);
		driver.switchTo().window(string);
	}
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alertsendKeys(String nels) {
		driver.switchTo().alert().sendKeys(nels);
	}
	public static void alertgetText() {
		driver.switchTo().alert().getText();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void threadwait() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void waitToBeClickable(int seconds,By ty) {
		WebDriverWait q=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		q.until(ExpectedConditions.elementToBeClickable(ty));
	}

	public static void waitToBeClick(int sec,WebElement h) {
		WebDriverWait n=new WebDriverWait(driver, Duration.ofSeconds(sec));
		n.until(ExpectedConditions.elementToBeClickable(h));
	}

	public static void visbilityOfElement(int a,WebElement h) {
		WebDriverWait o=new WebDriverWait(driver, Duration.ofSeconds(a));
		o.until(ExpectedConditions.visibilityOf(h));
	}
	public static void fluentWait(int a,int b,WebElement c) {
		FluentWait<WebDriver>n=new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(a)).
				pollingEvery(Duration.ofMillis(b));
		n.until(ExpectedConditions.elementToBeClickable(c));
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void insteadclk(WebElement b) {
		nel.executeScript("arguments[0].click()", b);
	}
	public static void insteadSendkeys(String value,String selenium,WebElement c) {
		nel.executeScript("arguments[0].setAttribute('value','selenium')", c);
	}
	public static void scrolldown(WebElement ne) {
		nel.executeScript("arguments[0].scrollIntoView(true)", ne);
	}
	public static void scrollUp(WebElement ji) {
		nel.executeScript("arguments[0].scrollIntoView(false)", ji);
	}
	public static void getAttribute(WebElement a,String b) {
		String attribute = a.getAttribute(b);
		System.out.println("Attribute Value is : "+attribute);
	}
	public static void getAttributeJs(String attributeName,WebElement jo) {
		Object executeScript = nel.executeScript("return arguments[0].getAttribute('"+attributeName+"')", jo);
		System.out.println("Attribute value by using js : "+executeScript);
	}
	public static void isDisplayed(WebElement ha) {
		boolean displayed = ha.isDisplayed();
		System.out.println("The Button is displayed or not : "+displayed);
	}
	public static void isEnabled(WebElement ip) {
		boolean enabled = ip.isEnabled();
		System.out.println("The text box is enabled or not : "+enabled);
	}
	public static void isSelected(WebElement ne) {
		boolean selected = ne.isSelected();
		System.out.println("The button is selected or not : "+selected);
	}
	public static String getTextCheck() {
		String title = driver.getTitle();
		return title;
	}
	public static String getUrlCheck() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void getText(WebElement a) {
		String text = a.getText();
		System.out.println("Text which is in the webpage : "+text);
	}
	public static void waitt() throws InterruptedException {
		Thread.sleep(5000);
	}

}
