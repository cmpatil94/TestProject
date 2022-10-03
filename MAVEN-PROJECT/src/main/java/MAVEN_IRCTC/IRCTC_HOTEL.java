package MAVEN_IRCTC;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTC_HOTEL {
	
	@FindBy ( xpath = "//a[text()=' HOTELS ']" ) 
	private WebElement Hotel;
	
	@FindBy ( xpath = "//a[contains(@href,'/hotel/search?name=Indore&fullName=Madhya%20')]" ) 
	private WebElement To;
	
	
	
	
	public IRCTC_HOTEL (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public void ClickOnHotel ()
	{
		Hotel.click();
	}
	
	public void ClickOnTo ()
	{
		To.click();
	}

}
