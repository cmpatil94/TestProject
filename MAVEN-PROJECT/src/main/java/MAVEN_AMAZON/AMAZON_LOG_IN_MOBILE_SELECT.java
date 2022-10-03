package MAVEN_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZON_LOG_IN_MOBILE_SELECT {
	
	private WebDriver driver ;
	private Actions Mouse ;
	
	
	
	@FindBy ( xpath = "//span[text()='Account & Lists']" ) 
	private WebElement Select;
	
	@FindBy ( xpath = "//input[@id='ap_email']" ) 
	private WebElement SignIN;
	

	@FindBy ( xpath = "//input[@id='continue']" ) 
	private WebElement Continue;
	
	@FindBy ( xpath = "//input[@id='ap_password']" ) 
	private WebElement Password;
	
	@FindBy ( xpath = "//input[@type='checkbox']" ) 
	private WebElement CheckBox;
	

	@FindBy ( xpath = "//a[text()='Mobiles']" ) 
	private WebElement Mobile;
	
	@FindBy ( xpath = "//span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']" ) 
	private WebElement OnePlus;
	

	
	
	public AMAZON_LOG_IN_MOBILE_SELECT (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	    Mouse = new Actions(driver);
	}

	
	
	
	public void ClickOnSelect ()
	{
		Select.click();
	}
	
	public void SendSignIN ()
	{
		SignIN.sendKeys("chandanpatilchinchol@gmail.com");
	}
	
	public void ClickOnContinue ()
	{
		Continue.click();
	}

	public void SendPassword ()
	{
		Password.sendKeys("CHANDAN2175");
	}
	
	public void ClickOnCheckBox ()
	{
		CheckBox.click();
	}
	
	public void ClickOnMobile ()
	{
		Mobile.click();
	}
	
	public void ClickOnOnePlus ()
	{
		Mouse.moveToElement(OnePlus);
		OnePlus.click();
	}
	
	
}
