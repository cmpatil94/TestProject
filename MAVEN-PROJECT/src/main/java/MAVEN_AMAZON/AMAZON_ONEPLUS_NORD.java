package MAVEN_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZON_ONEPLUS_NORD {
	
	
	@FindBy ( xpath = "//input[@id='twotabsearchtextbox']" ) 
	private WebElement Search;
	
	@FindBy ( xpath = "//input[@id='nav-search-submit-button']" ) 
	private WebElement ClickButton;
	
	@FindBy ( xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[2]" ) 
	private WebElement OnePlusNord;
	
	
	@FindBy ( xpath = "//input[@id='twotabsearchtextbox']" ) 
	private WebElement Clear;
	
	@FindBy ( xpath = "//span[@class='nav-line-2 ']" ) 
	private WebElement Click;
	
	
	public AMAZON_ONEPLUS_NORD (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void ClickOnSearch ()
	{
		Search.clear();
		Search.sendKeys("oneplus nord ce 2 5g");
	}
	
	public void ClickOnClickButton ()
	{
		ClickButton.click();
	}

	public void ClickOnOnePlusNord ()
	{
		OnePlusNord.click();
	}
	
	public void ClickOnClear ()
	{
		Clear.clear();
	}

	public void ClickOnClick ()
	{
		Click.click();
	}
	
	
}
