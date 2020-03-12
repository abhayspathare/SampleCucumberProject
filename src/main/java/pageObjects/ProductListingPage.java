package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage 
{
	public ProductListingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll (@FindBy(how=How.CSS , using=".noo-product-inner"))
	private List<WebElement> productList;
	
	@FindBy(how = How.LINK_TEXT , using="WHITE MILKMAID HOOK AND EYE BODYCON MIDI DRESS")
	private WebElement firstDress;
	
	
	public void selectProduct(int productNumber) throws InterruptedException
	{
		Thread.sleep(5000);
		firstDress.click();
		//productList.get(productNumber).click();
	}

}