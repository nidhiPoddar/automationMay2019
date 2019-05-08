package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class verifyLoginPage {
	
	@Test
	public void verifyLogin()
	{
		WebDriver driver = BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfigObj().getApplicationUrl());
		HomePage homePageObj = PageFactory.initElements(driver, HomePage.class);
		
		String appTitle = homePageObj.getApplicationTitle();
		System.out.println("the page title is "+appTitle);
		Assert.assertTrue(appTitle.contains("Shop"));
		homePageObj.clickOnLoginLink();
		
		LoginPage loginPageObj = PageFactory.initElements(driver, LoginPage.class);
		loginPageObj.login(DataProviderFactory.getExcelObj().getData(0, 0, 0), DataProviderFactory.getExcelObj().getData(0, 0, 1));
		
		loginPageObj.verifyLogOff();
		
		BrowserFactory.closeBrowser(driver);
	}

}
