package MAVEN_FLIPKART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLIPKART_SEARCH_PRODUCT_DETAIL_FUCTIONALTY {

	private WebDriver driver ;
	private Actions Mouse ;
	private boolean Result ;
	private String Title ;
	private String RatingRate ;
	
	
	@FindBy ( xpath = "//button[text()='✕']" ) 
	private WebElement Cross;
	
	@FindBy ( xpath = "//input[@name='q']" ) 
	private WebElement Search;
	
	@FindBy ( xpath = "//button[@type='submit']" ) 
	private WebElement SearchButton;
	

	@FindBy ( xpath = "//input[@name='q']" ) 
	private WebElement ProductName;
	
	@FindBy ( xpath = "//div[@class='col col-7-12']" ) 
	private WebElement Product;
	
	@FindBy ( xpath = "//span[contains(@id,'productRating')]" ) 
	private WebElement Rating;
	
	@FindBy ( xpath = "//span[contains(@id,'productRating')]" ) 
	private WebElement Price;
	
	
	
	public FLIPKART_SEARCH_PRODUCT_DETAIL_FUCTIONALTY (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	
	public void ClickOnCross ()
	{
		Cross.click();
	}
	
	public void ClickOnSearch ()
	{
		Search.clear();
		Search.sendKeys("MOBILE*");
	}

	public void ClickOnSearchButton ()
	{
		SearchButton.click();
		Search.clear();
	}
	
	public void SendPrductName ()
	{
		Search.clear();
		ProductName.sendKeys("OnePlus Nord CE 2 Lite 5G");
	}

	public void ClickOnProductSearch ()
	{
		SearchButton.click();
	}
	
	public void ClickOnProduct ()
	{
		Result = Product.isDisplayed();
		System.out.println(Result);
		
		Title = Product.getText();
		System.out.println(Title);
	}
	
	public void ClickOnRating ()
	{
		RatingRate = Rating.getText();
		System.out.println(RatingRate);
	}
	
	
}
