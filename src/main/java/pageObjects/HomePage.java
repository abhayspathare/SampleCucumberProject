package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage 
{
	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//configFileReader = new ConfigFileReader();
	}
	
	@FindBy(how=How.CSS , using="a.noo-search")
	private WebElement searchButton;
	
	@FindBy(how = How.CSS , using=".form-control")
	private WebElement searchBox;

	
	public void goToHomePage()
	{
		//driver.get(configFileReader.getURL());
		driver.get(FileReaderManager.getInstance().getConfigReader().getURL());
	}
	
	public void performSearch(String searchString)
	{
		searchButton.click();
		searchBox.sendKeys(searchString);
		searchBox.sendKeys(Keys.ENTER);
	}
}
