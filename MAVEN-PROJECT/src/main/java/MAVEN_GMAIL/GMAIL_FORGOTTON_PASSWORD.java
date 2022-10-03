package MAVEN_GMAIL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMAIL_FORGOTTON_PASSWORD {
	
	
	@FindBy ( xpath = "//input[@id='recoveryIdentifierId']" ) 
	private WebElement UserID;
	

	@FindBy ( xpath = "//span[text()='Next']" ) 
	private WebElement Next;
	
	@FindBy ( xpath = "//input[@id='firstName']" ) 
	private WebElement FirstName;
	
	@FindBy ( xpath = "//input[@id='lastName']" ) 
	private WebElement LastName;
	
	@FindBy ( xpath = "//span[text()='Next']" ) 
	private WebElement NextButton;
	
	
	
	public GMAIL_FORGOTTON_PASSWORD (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void SendUserID ()
	{
		UserID.sendKeys("chandanpatilchinchol");
	}
	
	public void clickOnNext ()
	{
		Next.click();
	}
	
	public void SendFirstName ()
	{
		FirstName.sendKeys("CHANDAN");
	}
	
	public void SendLastName ()
	{
		LastName.sendKeys("PATIL");
	}
	
	public void ClickOnNextButton ()
	{
		NextButton.click();
	}
	
	
}
