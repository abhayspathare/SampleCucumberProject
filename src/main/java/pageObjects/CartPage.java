package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.CSS , using = "a.checkout-button:nth-child(1)")
	private WebElement checkOutButton;
	
	public void proceedToCheckOut()
	{
		checkOutButton.click();
	}

}
