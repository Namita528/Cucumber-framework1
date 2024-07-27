package configReader;

import configurationBrowser.BrowserType;

public interface ConfigReader {
  public String getUsername();
  public String getPassword();
  public String getWebSite();
  public BrowserType getBrowser();
}
