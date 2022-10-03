package MAVEN_GMAIL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMAIL_CREATE_NEW_ACCOUNT {
	
	
	@FindBy ( xpath = "//input[@id='firstName']" ) 
	private WebElement FirstName;
	
	@FindBy ( xpath = "//input[@id='lastName']" ) 
	private WebElement LastName;
	

	@FindBy ( xpath = "//input[@id='username']" ) 
	private WebElement UserName;
	
	@FindBy ( xpath = "//input[@name='Passwd']" ) 
	private WebElement Password;
	
	@FindBy ( xpath = "//input[@aria-labelledby='selectioni1']" ) 
	private WebElement Tick;
	
	
	public GMAIL_CREATE_NEW_ACCOUNT (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void SendFirstName ()
	{
		FirstName.sendKeys("Chandan");
	}
	
	public void SendLastName ()
	{
		LastName.sendKeys("Patil");
	}
	
	public void SendUserName ()
	{
		UserName.sendKeys("chandan240694");
	}
	
	public void SendPassword ()
	{
		Password.sendKeys("chandan240694");
	}
	
	public void ClickOnTick ()
	{
		Tick.click();
	}
	
}
