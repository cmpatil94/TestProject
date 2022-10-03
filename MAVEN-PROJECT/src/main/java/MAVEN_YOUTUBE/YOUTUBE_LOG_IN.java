package MAVEN_YOUTUBE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YOUTUBE_LOG_IN {
	
	@FindBy ( xpath = "//yt-formatted-string[@class='style-scope ytd-button-renderer style-suggestive size-small']" ) 
	private WebElement SignIN;
	
	@FindBy ( xpath = "//input[@id='identifierId']" ) 
	private WebElement UserID;
	
	
	@FindBy ( xpath = "//span[text()='Next']" ) 
	private WebElement Next;
	
	@FindBy ( xpath = "//input[@name='password']" ) 
	private WebElement Password;
	
	@FindBy ( xpath = "//span[text()='Next']" ) 
	private WebElement Click;
	
	
	
	
	public YOUTUBE_LOG_IN (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnSignIN ()
	{
		SignIN.click();
	}

	public void SendUserID ()
	{
		UserID.sendKeys("chandanpatilchinchol@gmail.com");
	}
	
	public void ClickOnNext ()
	{
		Next.click();
	}

	public void SendPassword ()
	{
		Password.sendKeys("09158132112");
	}
	
	public void ClickOnClick ()
	{
		Click.click();
	}

}
