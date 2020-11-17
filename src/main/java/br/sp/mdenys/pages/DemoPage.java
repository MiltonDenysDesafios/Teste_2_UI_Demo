package br.sp.mdenys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.sp.mdenys.core.BasePage;

public class DemoPage extends BasePage {

	/**
	 * @author Milton
	 *  Fill Up Search Field
	 */
	public void fillUpSearch(String produto) {
		super.write(By.xpath("//*[@id='search_input']"), produto);
	}

	/**
	 * @author Milton
	 *  Click on Search Icon
	 */
	public void clickOnSearchIcon() {
		super.click(By.cssSelector(".ty-icon-search"));
	}

	/**
	 * @author Milton 
	 * Click on product on Grid
	 */
	public void clickOnProductGrid() {
		super.click(By.xpath("//*[@id=\"pagination_contents\"]/div[2]/div[1]/div/form/div[1]"));
	}

	/**
	 * @author Milton
	 *  Click on Add to Cart Button
	 */
	public void clickOnAddToCartButton() {
		super.click(By.xpath("//*[@id='button_cart_238']"));
		super.click(By.xpath("/html/body/div[5]/div/div[2]/div[1]/a"));

	}

	/**
	 * @author Milton 
	 * Scroll to the title
	 */
	public void scrollToTitle() {
		super.scrollScreen(By.cssSelector(".ty-product-block-title"));
	}

	/**
	 * @author Milton
	 *  Scroll to the Search field
	 */
	public void scrollToSearch() {

		super.scrollScreen(By.xpath("//*[@id='search_input']"));
	}

	/**
	 * @author Milton
	 *  Click on My cart button Click on View Cart Button
	 */
	public void clickOnMyCartIcon() {
		super.click(By.xpath("//*[@id='sw_dropdown_8']/a/i"));
		super.click(By.xpath("//*[@id=\"dropdown_8\"]/div/div[2]/div[1]/a"));
		super.colectProductNameCss(".ty-cart-content__product-title");

	}

	/**
	 * @author Milton
	 *  Colect product name and total price
	 * 
	 */
	public void colectProdutcNameAndTotalPrice() {
		String productName = super.colectProductNameCss(".ty-cart-content__product-title");
		String totalPrice = super.colectProductNameXpath("//div//td//span[2][@class=\"price\"]");
		System.out.println("Product Name: " + productName);
		System.out.println("Total Price: " + totalPrice);

	}

	/**
	 * @author Milton
	 *  Click on product on Grid
	 */
	public void clickProceedToCheckoutButton() {
		super.click(By.xpath("//*[@id=\"checkout_form\"]/div[1]/div[2]/a"));
	}

	/**
	 * @author Milton
	 *  Fill up the mandatory fields
	 */
	public void fillUpMandadoryFields(String adress, String zipCode, String email) {
		super.scrollScreen(By.xpath("//*[@id=\"litecheckout_payments_form\"]/div[1]/div[3]/div[1]/h2"));

		super.write(By.xpath("//*[@id=\"litecheckout_s_address\"]"), adress);
		super.write(By.xpath("//*[@id=\"litecheckout_s_zipcode\"]"), zipCode);
		super.write(By.xpath("//*[@id=\"litecheckout_email\"]"), email);

	}

	/**
	 * @author Milton C
	 * lick on the “Phone Order” Payment option
	 */
	public void clicPhoneOrderPaymentButton() {
		super.click(By.xpath("//*[@id=\"payments_2\"]"));
	}

	/**
	 * @author Milton 
	 * Click on the Terms and Conditions checkbox
	 */
	public void termsAndConditionsCheckbox() {
		super.scrollScreen(By.xpath("//*[@id=\"customer_phone\"]"));

		super.click(By.cssSelector(".cm-check-agreement"));

	}
	/**
	 * @author Milton 
	 * Click on the Place Order Button
	 */
	public void clickOnPlaceOrderButton() {
		super.click(By.xpath("//*[@id=\"litecheckout_place_order\"]"));
	}

}
