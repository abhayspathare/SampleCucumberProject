package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.LastPage;

public class LastPageSteps 
{
	TestContext testContext;
	LastPage lastPage;
	
	public LastPageSteps(TestContext context)
	{
		testContext = context;
		lastPage = testContext.getPageObjectManager().getLastPage();
	}
	
	@Then("^order gets placed successfully$")
	public void verifyOrderStatus()
	{	
		lastPage.verifyMessage();
	}

}
