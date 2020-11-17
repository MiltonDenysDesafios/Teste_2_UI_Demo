package br.sp.mdenys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.sp.mdenys.core.BasePage;

public class DemoPage extends BasePage{


	/**
	 * @author Milton
	 * Fill Up Search Field
	 */
	public void fillUpSearch(String produto) {
		super.escrever(By.xpath("//*[@id='search_input']"),produto);
	}
	/**
	 * @author Milton
	 * Click on Search Icon
	 */
	public void clickOnSearchIcon() {
		super.clicar(By.cssSelector(".ty-icon-search"));
	}
	/**
	 * @author Milton
	 * Click on product on Grid
	 */
	public void clickOnProductGrid() {
		super.clicar(By.cssSelector(".ty-center-block"));
	}
	/**
	 * @author Milton
	 * Click on Add to Cart Button
	 */
	public void clickOnAddToCartButton() {
		super.clicar(By.xpath("//*[@id='button_cart_248']"));
		super.clicar(By.xpath("/html/body/div[5]/div/div[2]/div[1]/a"));

	}
	/**
	 * @author Milton
	 * Scroll to the title
	 */
	public void scrollToTitle() {
		super.scrollaTela(By.cssSelector(".ty-product-block-title"));
	}
	/**
	 * @author Milton
	 * Scroll to the Search field
	 */
	public void scrollToSearch() {

		super.scrollaTela(By.xpath("//*[@id='search_input']"));
	}
	/**
	 * @author Milton
	 * Click on My cart button 
	 * Click on View Cart Button
	 */
	public void clickOnMyCartIcon(){
		super.clicar(By.xpath("//*[@id='sw_dropdown_8']/a/i"));
		super.clicar(By.xpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a"));
		super.coletaNomeProdutoCss(".ty-cart-content__product-title");
		
	}
	/**
	 * @author Milton
	 * Colect product name and total price
	
	 */
	public void colectProdutcNameAndTotalPrice(){
		String productName = super.coletaNomeProdutoCss(".ty-cart-content__product-title");	
		String totalPrice = super.coletaNomeProdutoXpath("//*[@id=\"sec_product_subtotal_1706372553\"]");
		System.out.println("Product Name: "+productName);
		System.out.println("Total Price: " +totalPrice);

		
	}
	
	
	
}
