package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;

public class CheckOutPageSteps 
{
	TestContext testContext;
	CheckoutPage checkoutPage;
	
	public CheckOutPageSteps(TestContext context)
	{
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getCheckOutPage();
	}
	
	@When("^enters personal details on checkout page$")
	public void enters_personal_details_on_checkout_page() throws Throwable {
		checkoutPage.fillPersonalDetails();
		Thread.sleep(5000);
	}
			
	@When("^place the order$")
	public void place_the_order() throws Throwable {			
		checkoutPage.clickAgreeButton();
		checkoutPage.clickOrderPlaceButton();
		Thread.sleep(5000);
	}

}
