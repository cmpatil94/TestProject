package MAVEN_YOUTUBE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YOUTUBE_RASHMIKA_MANDANA {
	
	
	@FindBy ( xpath = "//input[@id='search']" ) 
	private WebElement Search;
	
	@FindBy ( xpath = "(//yt-icon[contains(@class,'style-scope ytd-searchbox')])[2]" ) 
	private WebElement SearchButton;
	
	
	@FindBy ( xpath = "(//yt-icon[@class='style-scope ytd-searchbox'])[2]" ) 
	private WebElement Video;
	
	@FindBy ( xpath = "//yt-formatted-string[text()='Filters']" ) 
	private WebElement Filter;
	
	@FindBy ( xpath = "(//yt-formatted-string[@class='style-scope ytd-search-filter-renderer'])[2]" ) 
	private WebElement Today;
	
	@FindBy ( xpath = "(//a[@href='/watch?v=bY8bEaJp3x8'])[2]" ) 
	private WebElement Image;
	
	@FindBy ( xpath = "//div[@id='ad-text:6']" ) 
	private WebElement Open;
	
	
	
	
	
	public YOUTUBE_RASHMIKA_MANDANA (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void SendSearch ()
	{
		Search.clear();
		Search.sendKeys("rashmika mandana");
	}

	public void ClickOnSearchButton ()
	{
		SearchButton.click();
	}
	
	public void ClickOnVideo ()
	{
		Video.click();
	}

	public void ClickOnFilter ()
	{
		Filter.click();
	}
	
	public void ClickOnToday ()
	{
		Today.click();
	}
	
	public void ClickOnImage ()
	{
		Image.click();
	}
	
	public void ClickOnOpen ()
	{
		Open.click();
	}

}
