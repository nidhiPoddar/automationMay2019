package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider()
	{
		File src = new File("D:\\workspace\\com.Interview.Framework.practice\\ConfigurationFiles\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());

	    }
		
	}
	public String getApplicationUrl()
	{
		String myurl = pro.getProperty("url");
		return myurl;
	}
	
	public String getChromePath()
	{
		String data = pro.getProperty("chromepath");
		return data;
	}

}
