package MAVEN_FACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FACEBOOK_FORGOTTEN_PASSWORD {
	
	
	@FindBy ( xpath = "//a[text()='Forgotten password?']" ) 
	private WebElement Forgotten;
	
	@FindBy ( xpath = "//input[@id='identify_email']" ) 
	private WebElement IdentifyEMail;
	
	@FindBy ( xpath = "//button[@id='did_submit']" ) 
	private WebElement Search;
	
	
	public FACEBOOK_FORGOTTEN_PASSWORD (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void ClickOnForgotten ()
	{
		Forgotten.click();
	}
	
	public void ClickOnIdentifyEMail ()
	{
		IdentifyEMail.click();
	}
	
	public void ClickOnSearch ()
	{
		Search.click();
	}

}
