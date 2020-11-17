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

	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public void scrollaTela(By by){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", getDriver().findElement(by));
    }
	
	public void scrollaTela(String id){
		scrollaTela(By.id(id));
    }
	
	
	public void  clicarEmElementoDaTelaFrame(String xpath){
					
		driver.switchTo().frame("__privateStripeController9061");
		driver.findElement(By.xpath(xpath)).click();		
	}
	
	public void implicityWaitVisibleElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	/**
	 * metodo para coletar o texto pelo tipo
	 */
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	/**
	 * metodo para coletar o texto pelo css selector
	 */
	public String coletaNomeProdutoCss(String texto) {
		return obterTexto(By.cssSelector(texto));

	}
	/**
	 * metodo para coletar o texto pelo xpath
	 */
	public String coletaNomeProdutoXpath(String texto) {
		return obterTexto(By.xpath(texto));

	}
	
}
