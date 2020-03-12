package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Enum.DriverType;

public class WebDriverManager 
{
	private WebDriver driver;
	private static DriverType driverType;
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	
	public WebDriverManager()
	{
		driverType = FileReaderManager.getInstance().getConfigReader().getDriverType();
	}
	
	public WebDriver getDriver()
	{
		if (driver == null)
			return driver = createLocalDriver();
		return driver;
	}
	
	private WebDriver createLocalDriver()
	{
		switch(driverType)
		{
		case FIREFOX : 
		System.setProperty(FIREFOX_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new FirefoxDriver();
		break;
		case CHROME : driver = new ChromeDriver();
		//System.setProperty(FIREFOX_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverPath());
		break;
		case INTERNETEXPLORER : driver = new InternetExplorerDriver();
		//System.setProperty(FIREFOX_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverPath());
		break;		
		}
		return driver;
	}
	
	public void closeDriver()
	{
		driver.quit();
	}
}
