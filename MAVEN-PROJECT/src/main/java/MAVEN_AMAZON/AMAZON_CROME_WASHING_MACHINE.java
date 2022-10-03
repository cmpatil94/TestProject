package MAVEN_AMAZON;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZON_CROME_WASHING_MACHINE {
	
	
	@FindBy ( xpath = "//input[@id='twotabsearchtextbox']" ) 
	private WebElement SerchWashingMachiene;
	
	@FindBy ( xpath = "(//div[@data-component-type='s-search-result']//h2)[1]" ) 
	private WebElement CromeWashingMachineSerch;
	
	@FindBy ( xpath = "//span[contains(text(),'(CRLWMD702STL75, Grey)')]" ) 
	private WebElement CromeWashingMachineClick;
	
	
	
	public AMAZON_CROME_WASHING_MACHINE (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void SendSerchWashingMachiene ()
	{
		SerchWashingMachiene.sendKeys("IFB Washing Machiene");
		SerchWashingMachiene.sendKeys(Keys.ENTER);
	}
	
	public void ClickOnCromeWashingMachineSerch ()
	{
		CromeWashingMachineSerch.click();
	}

	public void ClickOnCromeWashingMachineClick ()
	{
		CromeWashingMachineClick.click();
	}

}
