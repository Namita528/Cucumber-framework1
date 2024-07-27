package configReader;

import java.util.Properties;

import configurationBrowser.BrowserType;
import utility.ResourceHelper;

public class PropertyFileReader implements ConfigReader {

	private Properties prop = null;
	
	public PropertyFileReader() {
	    prop = new Properties();
	    try {
	    	prop.load(ResourceHelper.getResourcePathInputStream("/src/main/java/configfile/config.properties"));
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return prop.getProperty("Username");
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return prop.getProperty("Password");
	}

	@Override
	public String getWebSite() {
		// TODO Auto-generated method stub
		return prop.getProperty("Website");
	}

	@Override
	public BrowserType getBrowser() {
		// TODO Auto-generated method stub
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}

	
}
