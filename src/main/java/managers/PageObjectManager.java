package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LastPage;
import pageObjects.ProductListingPage;
import pageObjects.ProductPage;

public class PageObjectManager 
{
	private WebDriver driver;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	private HomePage homePage;
	private LastPage lastPage;
	private ProductListingPage productListingPage;
	private ProductPage productpage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sampleMethod()
	{
		System.out.println("Inside sample method");
	}
	
	public HomePage getHomePage()
	{
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public CartPage getCartPage()
	{
		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	}
	
	public CheckoutPage getCheckOutPage()
	{
		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	}
	
	public LastPage getLastPage()
	{
		return (lastPage == null) ? lastPage = new LastPage(driver) : lastPage;
	}
	
	public ProductListingPage getProductListingPage()
	{
		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
	}
	
	public ProductPage getProductPage()
	{
		return (productpage == null) ? productpage = new ProductPage(driver) : productpage;
	}

}
