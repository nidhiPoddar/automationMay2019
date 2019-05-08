package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	@FindBy(xpath="//u[text()='login']") WebElement loginLink;
	@FindBy(xpath="//u[text()='create an account']") WebElement createAccountLink;
	
	public void clickOnLoginLink()
	{
		loginLink.click();
	}
	public void clickOnCreateAccountLink()
	{
		createAccountLink.click();
	}
		
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	

}
