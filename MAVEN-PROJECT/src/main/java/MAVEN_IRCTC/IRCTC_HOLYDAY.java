package MAVEN_IRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTC_HOLYDAY {
	
	WebDriver driver ;
	Actions Mouse ;
	
	
	@FindBy ( xpath = "//a[text()=' HOLIDAYS ']" ) 
	private WebElement Holiday;
	
	@FindBy ( xpath = "//span[text()='Packages']" ) 
	private WebElement Packages;
	
	@FindBy ( xpath = "//span[text()='Tour Packages']" ) 
	private WebElement TourPackages;
	
	@FindBy ( xpath = "(//a[text()='Book Now '])[5]" ) 
	private WebElement VaishnoDeviDarshan;
	
	@FindBy ( xpath = "//select[contains(@class,'form-control custom-select ng-un')]" ) 
	private WebElement TourStartingDate;
	
	
	
	
	public IRCTC_HOLYDAY (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	public void ClickOnHoliday ()
	{
		Holiday.click();
	}
	
	public void ClickOnPackages ()
	{
		Packages.click();
	}
	
	public void ClickOnTourPackages ()
	{
		TourPackages.click();
	}
	

	public void ClickOnVaishnoDeviDarshan ()
	{
		Mouse.moveToElement(VaishnoDeviDarshan);
		VaishnoDeviDarshan.click();
	}
	
	public void ClickOnTourStartingDate ()
	{
		TourStartingDate.click();
	}

}
