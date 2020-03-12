package stepDefinations;

import cucumber.TestContext;
import pageObjects.ProductPage;

public class ProductPageSteps 
{
	TestContext testContext;
	ProductPage productPage;
	
	public ProductPageSteps(TestContext context)
	{
		testContext = context;
		productPage = testContext.getPageObjectManager().getProductPage();
	}
	
	

}
