package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Enum.DriverType;

public class ConfigFileReader 
{
	private Properties properties;
	private final String propertyFilePath = "configs/Configuration.properties";
	
	public ConfigFileReader()
	{
		BufferedReader reader;
		try
		{
			reader = new BufferedReader ( new FileReader(propertyFilePath));
			properties = new Properties();
			try
			{
				properties.load(reader);
				reader.close();
			}
			catch(IOException e)
			{e.printStackTrace();}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public String getDriverPath()
	{
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");					
	}
	
	public String getURL()
	{
		String applicationURL = properties.getProperty("url");
		if (applicationURL != null) return applicationURL;
		else throw new RuntimeException("Application URL not specified in the Configuration.properties file");
	}
	
	public DriverType getDriverType()
	{
		String browserName;
		browserName = properties.getProperty("browser");
		if (browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		if (browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		if (browserName.equalsIgnoreCase("internetexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser name key value not matched in Configuration.properties file" + browserName);
	}
}
