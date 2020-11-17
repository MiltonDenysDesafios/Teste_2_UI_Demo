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

	public void write(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		write(By.id(id_campo), texto);
	}
	
	
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public void scrollScreen(By by){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", getDriver().findElement(by));
    }
	
	public void scrollScreenId(String id){
		scrollScreen(By.id(id));
    }
	
	
	public void implicityWaitVisibleElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	/**
	 * metodo para coletar o texto pelo tipo
	 */
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	/**
	 * metodo para coletar o texto pelo css selector
	 */
	public String colectProductNameCss(String texto) {
		return getText(By.cssSelector(texto));

	}
	/**
	 * metodo para coletar o texto pelo xpath
	 */
	public String colectProductNameXpath(String texto) {
		return getText(By.xpath(texto));

	}
	
}
