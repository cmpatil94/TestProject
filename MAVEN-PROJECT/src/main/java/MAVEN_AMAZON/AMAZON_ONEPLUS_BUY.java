package MAVEN_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZON_ONEPLUS_BUY {
	
	@FindBy ( xpath = "//input[@id='buy-now-button']" ) 
	private WebElement Buy;
	
	@FindBy ( xpath = "//input[@id='ap_email']" ) 
	private WebElement BuyNowSignIN;
	

	@FindBy ( xpath = "//input[@id='continue']" ) 
	private WebElement BuyNowContinue;
	
	@FindBy ( xpath = "//input[@id='ap_password']" ) 
	private WebElement BuyNowPassword;
	
	@FindBy ( xpath = "//input[@id='signInSubmit']" ) 
	private WebElement SignIN1;
	
	
	
	public AMAZON_ONEPLUS_BUY (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void ClickOnBuy ()
	{
		Buy.click();
	}
	
	public void SendBuyNowSignIN ()
	{
		BuyNowSignIN.sendKeys("chandanpatilchinchol@gmail.com");
	}

	public void ClickOnBuyNowContinue ()
	{
		BuyNowContinue.click();
	}
	
	public void SendBuyNowPassword ()
	{
		BuyNowPassword.sendKeys("Amazon@2147");
	}

	public void ClickOnSignIN1 ()
	{
		SignIN1.click();
	}
	
	
}
