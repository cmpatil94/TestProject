package MAVEN_AMAZON;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMAZON_HOME_PAGE {
	
	WebDriver driver ;
	
	Actions Mouse ;
	
	
	@FindBy ( xpath = "//a[@id='createAccountSubmit']" ) 
	private WebElement CreateAccount;
	
	@FindBy ( xpath = "//span[@class='a-dropdown-prompt']" ) 
	private WebElement Code;
	
	
	@FindBy ( xpath = "//a[@id='auth-country-picker_34']" ) 
	private WebElement Select1;
	
	@FindBy ( xpath = "//i[@class='a-icon a-icon-logo']" ) 
	private WebElement AmazonHome;
	
	
	@FindBy ( xpath = "//span[text()='Account & Lists']" ) 
	private WebElement AccountList;
	
	@FindBy ( xpath = "//input[@id='ap_email']" ) 
	private WebElement SignIN2;
	
	@FindBy ( xpath = "//input[@id='ap_email']" ) 
	private WebElement SignIN3;
	
	@FindBy ( xpath = "//i[@class='a-icon a-icon-logo']" ) 
	private WebElement Home;
	
	
	@FindBy ( xpath = "(//a[@id='icp-touch-link-language']//span)" ) 
	private WebElement Language;
	
	@FindBy ( xpath = "(//i[@class='a-icon a-icon-radio'])[8]" ) 
	private WebElement Marathi;
	
	@FindBy ( xpath = "//a[@id='nav-logo-sprites']" ) 
	private WebElement AmazonHomee;
	
	
	
	
	public AMAZON_HOME_PAGE (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions(driver);
	}
	
	
	
	public void ClickOnCreateAccount ()
	{
		CreateAccount.click();
	}
	
	public void ClickOnCode ()
	{
		Code.click();
	}

	public void ClickOnSelect1 ()
	{
		Select1.click();
	}
	
	public void ClickOnAmazonHome ()
	{
		AmazonHome.click();
	}
	
	public void ClickOnAccountList ()
	{
		AccountList.click();
	}
	
	public void ClickOnSignIN2 ()
	{
		SignIN2.click();
	}
	
	public void ClickOnSignIN3 ()
	{
		SignIN3.click();
	
		boolean s = SignIN3.isSelected();
		System.out.println(s);
		
		if(s == true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		boolean e = SignIN3.isEnabled();
		System.out.println(e);
		
		boolean d = SignIN3.isDisplayed();
		System.out.println(d);
	}

	public void ClickOnHome ()
	{
		Home.click();
	}
	
	public void ClickOnLanguage ()
	{
		Mouse.moveToElement(Language).click().build().perform();
		Mouse.click();
	}
	
	public void ClickOnMarathi ()
	{
		Mouse.moveToElement(Marathi).perform();
		Marathi.click();
	}

	public void ClickOnAmazonHomee ()
	{
		AmazonHomee.click();
	}

}
