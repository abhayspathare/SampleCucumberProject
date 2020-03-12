package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LastPage 
{
	public LastPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS , using=".woocommerce-thankyou-order-received")
	private WebElement testMsg_Success;
	
	public void verifyMessage()
	{
		String msg;
		msg = testMsg_Success.getText();
		String expectedMsg;
		expectedMsg = "Thank you. Your order has been received.";
		Assert.assertEquals(expectedMsg, msg);
	}
	
}
