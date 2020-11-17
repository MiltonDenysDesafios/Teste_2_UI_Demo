package br.sp.mdenys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.sp.mdenys.core.BasePage;

public class DemoPage extends BasePage{
	private static WebDriver driver;

	
	public void fillUpSearch() {
		super.escrever(By.xpath("//*[@id='search_input']"),"X-Box One");
	}
	public void clickOnSearchIcon() {
		super.clicar(By.cssSelector(".ty-icon-search"));
	}
	public void clickOnProductGrid() {
		super.clicar(By.cssSelector(".ty-center-block"));
	}
	public void clickOnAddToCartButton() {
		super.clicar(By.xpath("//*[@id='button_cart_248']"));
	}
	
	public void scrollToTitle() {
		super.scrollaTela(By.cssSelector(".ty-product-block-title"));
	}
	public void scrollToSearch() {
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='button_cart_248']"))));
		super.scrollaTela(By.xpath("//*[@id='search_input']"));
	}
	
	public void clickOnMyCartIcon() {

		super.clicar(By.xpath("//*[@id='sw_dropdown_8']/a/i"));
	}
	
	
	
	
}
