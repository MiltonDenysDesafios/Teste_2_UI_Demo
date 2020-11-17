package br.sp.mdenys.core;

import static br.sp.mdenys.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private static WebDriver driver;

	/**
	 * @author Milton
	 *  method to write down a string
	 */
	public void write(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
	/**
	 * @author Milton
	 *  method to click on a element
	 */
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	/**
	 * @author Milton
	 *  method to sroll the screen until a element
	 */
	public void scrollScreen(By by){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", getDriver().findElement(by));
    }
	
	/**
	 * @author Milton
	 *  method to wait until an element to be visible
	 */
	public void implicityWaitVisibleElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	/**
	 * method to collect a text by element
	 */
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	/**
	 *method to collect a text by css selector
	 */
	public String colectProductNameCss(String texto) {
		return getText(By.cssSelector(texto));

	}
	/**
	 * method to collect a text by xpath
	 */
	public String colectProductNameXpath(String texto) {
		return getText(By.xpath(texto));

	}
	
}
