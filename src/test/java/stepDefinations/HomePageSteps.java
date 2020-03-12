package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

public class HomePageSteps 
{
	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context)
	{
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	homePage.goToHomePage();
	}
	
	@When("^he searches for \"([^\"]*)\"$")
	public void he_searches_for(String arg1) throws Throwable {
		homePage.performSearch(arg1);		
	}
}
