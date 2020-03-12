package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductListingPage;
import pageObjects.ProductPage;

public class ProductListingPageSteps 
{
	TestContext testContext;
	ProductListingPage productListingPage;
	ProductPage productPage;
	
	public ProductListingPageSteps(TestContext context)
	{
		testContext = context;
		productListingPage = testContext.getPageObjectManager().getProductListingPage();
		productPage = testContext.getPageObjectManager().getProductPage();
	}
	
	@When("^choose to buy first item$")
	public void choose_to_buy_first_item() throws Throwable {		
		productListingPage.selectProduct(1);		
		Thread.sleep(5000);
		productPage.selectColour("White");
		productPage.selectSize("Medium");
		productPage.addToCart();
		productPage.openCart();
	}
}
