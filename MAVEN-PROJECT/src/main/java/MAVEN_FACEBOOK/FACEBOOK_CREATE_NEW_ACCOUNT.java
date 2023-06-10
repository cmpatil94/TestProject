package MAVEN_FACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FACEBOOK_CREATE_NEW_ACCOUNT {

	
	@FindBy ( xpath = "//input[@placeholder='First name']" ) 
	private WebElement FirstName;
	
	@FindBy ( xpath = "//input[@name='lastname']" ) 
	private WebElement SurName;
	
	@FindBy ( xpath = "//input[@id='password_step_input']" ) 
	private WebElement NewPassword;
	
	@FindBy ( xpath = "//select[@id='day']" ) 
	private WebElement Day;
	
	@FindBy ( xpath = "//select[@id='month']" ) 
	private WebElement Month;
	
	@FindBy ( xpath = "//select[@id='year']" ) 
	private WebElement Year;
	
	@FindBy ( xpath = "//input[@value='2']" ) 
	private WebElement Gender;
	
	@FindBy ( xpath = "//button[text()='Sign Up']" ) 
	private WebElement SignUP;
	

	
	public FACEBOOK_CREATE_NEW_ACCOUNT (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendFirstName ()
	{
		FirstName.sendKeys("CHANDAN");
	}
	
	public void sendSurName ()
	{
		SurName.sendKeys("PATIL");
	}
	
	public void sendNewPassword ()
	{
		NewPassword.sendKeys("PASS@123");
	}
	
	public void ClickOnGender ()
	{
		Gender.click();
	}
	
	public void ClickOnSignUP ()
	{
		SignUP.click();
	}
	
	
	
}
