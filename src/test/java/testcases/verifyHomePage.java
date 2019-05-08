package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class verifyHomePage {
	
	@Test
	public void verifyTitleofHomePage()
	{
		WebDriver driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfigObj().getApplicationUrl());
		HomePage homePageObj = PageFactory.initElements(driver, HomePage.class);
		
		String appTitle = homePageObj.getApplicationTitle();
		System.out.println("the page title is "+appTitle);
		Assert.assertTrue(appTitle.contains("Shop"));
		
		BrowserFactory.closeBrowser(driver);
	}

}
