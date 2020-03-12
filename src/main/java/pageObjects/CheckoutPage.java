package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(how = How.CSS , using="#billing_first_name")
	private WebElement txtbox_firstName;

	@FindBy(how = How.CSS , using="#billing_last_name")
	private WebElement txtbox_lastName;
	
	@FindBy(how = How.CSS , using="#billing_address_1")
	private WebElement txtbox_billingAddress;
	
	@FindBy(how = How.CSS , using="#billing_city")
	private WebElement txtbox_billingCity;
	
	@FindBy(how = How.CSS , using="#billing_postcode")
	private WebElement txtbox_billingPostCode;
	
	@FindBy(how = How.CSS , using="#billing_phone")
	private WebElement txtbox_billingPhone;
	
	@FindBy(how = How.CSS , using="#billing_email")
	private WebElement txtbox_billingEmail;
	
	@FindBy(how = How.CSS , using="#select2-billing_state-container")
	private WebElement dropDown_stateSelector;
	
	@FindBy(how = How.CSS , using=".select2-search__field")
	private WebElement dropDown_stateName;
	
	@FindBy(how = How.CSS , using="#terms")
	private WebElement button_terms;
	
	@FindBy(how = How.CSS , using="#place_order")
	private WebElement button_placeOrder;
	
	public void enterFirstName(String firstName)
	{
		txtbox_firstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		txtbox_lastName.sendKeys(lastName);
	}
	
	public void enterBillingAddress(String address)
	{
		txtbox_billingAddress.sendKeys(address);
	}
	
	public void enterBillingCity(String cityName)
	{
		txtbox_billingCity.sendKeys(cityName);
	}
	
	public void enterBillingPostCode(String postCode)
	{
		txtbox_billingPostCode.sendKeys(postCode);
	}
	
	public void enterBillingPhone(String phoneNum)
	{
		txtbox_billingPhone.sendKeys(phoneNum);
	}
	
	public void enterBillingEmail(String emailId)
	{
		txtbox_billingEmail.sendKeys(emailId);
	}
	
	public void enterBillingState(String statename)
	{
		dropDown_stateSelector.click();
		dropDown_stateName.sendKeys(statename);
		dropDown_stateName.sendKeys(Keys.TAB);
	}
	
	public void fillPersonalDetails()
	{
		enterFirstName("Ajay");
		enterLastName("Ambre");
		enterBillingAddress("Pimple Saudagar");
		enterBillingCity("Pune");
		enterBillingPostCode("411015");
		enterBillingPhone("8889997771");
		enterBillingEmail("test@gmail.com");
		enterBillingState("Maharashtra");
	}
	
	public void clickOrderPlaceButton()
	{
		button_placeOrder.click();
	}
	
	public void clickAgreeButton()
	{
		button_terms.click();
	}
}
