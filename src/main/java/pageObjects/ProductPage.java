package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage 
{
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.CSS , using="#pa_color")
	private WebElement colourSelection;
	
	@FindBy(how =How.CSS , using="#pa_size")
	private WebElement sizeSelection;
	
	@FindBy(how = How.CSS , using=".single_add_to_cart_button")
	private WebElement addToCartButton;
	
	@FindBy(how = How.CSS , using = ".icon_bag_alt" )
	private WebElement cartIcon;
	
	public void selectColour(String color)
	{
		Select selectColour = new Select(colourSelection);
		selectColour.selectByVisibleText(color);
	}
	
	public void selectSize(String size)
	{
		Select selectSize = new Select(sizeSelection);
		selectSize.selectByVisibleText(size);
	}
	
	public void addToCart()
	{
		addToCartButton.click();
	}
	
	public void openCart()
	{
		cartIcon.click();
	}

}
