package MAVEN_GMAIL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMAIL_SIGN_IN {
	
	
	@FindBy ( xpath = "//input[@id='identifierId']" ) 
	private WebElement UserID;
	
	@FindBy ( xpath = "//span[text()='Next']" ) 
	private WebElement Next;
	

	@FindBy ( xpath = "//span[text()='Create account']" ) 
	private WebElement CreateAccount;
	
	
	
	public GMAIL_SIGN_IN  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickOnIdentifyEMail ()
	{
		UserID.sendKeys("chandanmohanpatil");
	}
	
	public void ClickOnSearch ()
	{
		Next.click();
	}

	public void ClickOnCreateAccount ()
	{
		CreateAccount.click();
	}
	
	
	
}
