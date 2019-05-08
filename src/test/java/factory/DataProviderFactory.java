package factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {
	
	public static ConfigDataProvider getConfigObj()
	{
		ConfigDataProvider configObj = new ConfigDataProvider();
		return configObj;
	}
	
	public static ExcelDataProvider getExcelObj()
	{
		ExcelDataProvider excelObj = new ExcelDataProvider();
		return excelObj;
	}

}
