package MAVEN_IRCTC;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTC_FLIGHT {
	
	WebDriver driver ;
	Actions Mouse ;
	
	
	@FindBy ( xpath = "//span[@class='allcircle circleone']" ) 
	private WebElement FlightClick;
	
	@FindBy ( xpath = "//button[text()='Later']" ) 
	private WebElement LaterButton;
	
	@FindBy ( xpath = "//input[@id='stationFrom']" ) 
	private WebElement From;
	
	
	@FindBy ( xpath = "//input[@id='stationTo']" ) 
	private WebElement To;
	
	@FindBy ( xpath = "//input[@id='originDate']" ) 
	private WebElement Departure;
	
	@FindBy ( xpath = "//span[text()='March']" ) 
	private WebElement Month;
	
	@FindBy ( xpath = "//span[text()=' 17']" ) 
	private WebElement Date17;
	
	@FindBy ( xpath = "(//button[@type='submit'])[3]" ) 
	private WebElement Search;
	
	
	
	
	public IRCTC_FLIGHT (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	
	public void MouseActionFlightClick ()
	{
		Mouse.moveToElement(FlightClick);
		FlightClick.click();
	}
	
	
	
	public void ClickOnLaterButton ()
	{
		LaterButton.click();
	}
	
	public void SendFrom ()
	{
		From.click();
		From.sendKeys("New Delhi (DEL)");
	}
	
	public void SendTo ()
	{
		To.click();
		To.sendKeys("Mumbai (BOM)");
	}
	
	public void ClickOnDeparture ()
	{
		Departure.click();
	}
	
	public void SendMonth ()
	{
		Month.click();
	}
	
	
	public void SendDate17 ()
	{
		Date17.click();
	}
	
	
	public void ClickOnSearch()
	{
		Search.click();
	}

}
