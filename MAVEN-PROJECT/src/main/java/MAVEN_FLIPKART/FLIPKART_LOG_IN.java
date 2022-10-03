package MAVEN_FLIPKART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLIPKART_LOG_IN {
	
	WebDriver driver ;
	Actions Mouse ;
	
	
	
	@FindBy ( xpath = "//button[text()='✕']" ) 
	private WebElement Cross;
	
	@FindBy ( xpath = "//a[text()='Login']" ) 
	private WebElement Login;
	
	@FindBy ( xpath = "//div[text()='My Profile']" ) 
	private WebElement MyProfile;
	

	@FindBy ( xpath = "(//input[@autocomplete='off'])[2]" ) 
	private WebElement UserId;
	
	@FindBy ( xpath = "(//input[@autocomplete='off'])[3]" ) 
	private WebElement Password;
	
	@FindBy ( xpath = "(//span[text()='Login'])[2]" ) 
	private WebElement LogIn;
	
	
	public FLIPKART_LOG_IN (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	
	public void ClickOnCross ()
	{
		Cross.click();
	}
	
	public void MouseActionLogin ()
	{
		Mouse.moveToElement(Login).perform();
	}

	public void MouseActionMyProfile ()
	{
		Mouse.moveToElement(MyProfile).click().build().perform();
	}
	
	public void SendUserId ()
	{
		UserId.sendKeys("chandanpatilchinchol@gmail.com");
	}

	public void SendPassword ()
	{
		Password.sendKeys("Flipkart@2147");
	}
	
	public void ClickOnLogIn ()
	{
		LogIn.click();
	}

}
