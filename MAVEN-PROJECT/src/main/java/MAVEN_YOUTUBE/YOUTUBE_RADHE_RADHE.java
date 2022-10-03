package MAVEN_YOUTUBE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YOUTUBE_RADHE_RADHE {
	
	private WebDriver driver ;
	private Actions Mouse ;
	
	
	@FindBy ( xpath = "(//yt-chip-cloud-chip-renderer[@role='tab'])[2]//yt-formatted-string" ) 
	private WebElement Live;
	
	@FindBy ( xpath = "//yt-formatted-string[@id='video-title']" ) 
	private WebElement song;
	
	@FindBy ( xpath = "//input[@id='search']" ) 
	private WebElement Search2;
	
	@FindBy ( xpath = "//button[@id='search-icon-legacy']//yt-icon" ) 
	private WebElement SearchButton2;
	
	@FindBy ( xpath = "//input[@id='search']" ) 
	private WebElement SearchButton1;
	
	@FindBy ( xpath = "//yt-formatted-string[text()='राधाकृष्ण के 14 मधुर गीत']" ) 
	private WebElement Search1;
	
	
	
	
	
	public YOUTUBE_RADHE_RADHE (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions(driver);
	}
	
	
	
	public void ClickOnLive ()
	{
		Live.click();
	}

	public void ClickOnsong ()
	{
		song.click();
	}
	
	public void SendSearch2 ()
	{
		Search2.sendKeys("STAR BHARAT RADHA KRISHNA");
	}

	public void ClickOnSearchButton2 ()
	{
		SearchButton2.click();
	}
	
	public void ClickOnSearchButton1 ()
	{
		SearchButton1.clear();
	}
	
	public void SendSearch1 ()
	{
		Mouse.moveToElement(Search1).doubleClick().build().perform();
	}
	
	
	

}
