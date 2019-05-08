package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	@FindBy(xpath="//input[@name='email_address']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//span[text()='Sign In']") WebElement signIn;
	By logOff = By.xpath("//span[text()='Log Off']");
	
	public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		signIn.click();
	}
	
	public void verifyLogOff()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(logOff));
		String myText = ele.getText();
		Assert.assertEquals(myText, "Log Off");
		
		
	}
	
	
	
	
	
	
	

}
