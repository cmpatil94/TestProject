package MAVEN_FLIPKART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLIPKART_KEYBOARD_BUY {
	
	@FindBy ( xpath = "//button[text()='BUY NOW']" ) 
	private WebElement BuyNow;
	
	@FindBy ( xpath = "//input[@maxlength='auto']" ) 
	private WebElement EnterEMail;
	
	@FindBy ( xpath = "//span[text()='CONTINUE']" ) 
	private WebElement Continue;
	
	@FindBy ( xpath = "//input[@type='password']" ) 
	private WebElement Password;
	
	@FindBy ( xpath = "//button[@type='submit']" ) 
	private WebElement Submit;
	
	@FindBy ( xpath = "//div[text()='Add a new address']" ) 
	private WebElement NewAddressForm;
	
	@FindBy ( xpath = "//input[@name='name']" ) 
	private WebElement Name;
	
	@FindBy ( xpath = "//input[@name='phone']" ) 
	private WebElement Phone;
	
	@FindBy ( xpath = "//input[@name='pincode']" ) 
	private WebElement PinCodeAddress;
	
	@FindBy ( xpath = "//textarea[@name='addressLine1']" ) 
	private WebElement Addresss;
	
	@FindBy ( xpath = "//input[@name='city']" ) 
	private WebElement City;
	
	@FindBy ( xpath = "//select[@name='state']" ) 
	private WebElement State;
	
	@FindBy ( xpath = "//option[@value='Maharashtra']" ) 
	private WebElement Maharashta;
	
	@FindBy ( xpath = "(//label[@for='HOME']//div)[1]" ) 
	private WebElement LocationTypeTag;
	
	@FindBy ( xpath = "//button[text()='Save and Deliver Here']" ) 
	private WebElement SaveDeliver;
	
	
	
	public FLIPKART_KEYBOARD_BUY (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickOnBuyNow ()
	{
		BuyNow.click();
	}

	public void SendEnterEMail ()
	{
		EnterEMail.sendKeys("chandanpatilchinchol@gmail.com");
	}
	
	public void ClickOnContinue ()
	{
		Continue.click();
	}

	public void SendPassword ()
	{
		Password.sendKeys("Flipkart@2147");
	}
	
	public void ClickOnSubmit ()
	{
		Submit.click();
	}
	
	
	public void ClickOnNewAddressForm ()
	{
		NewAddressForm.click();
	}

	public void SendName ()
	{
		Name.sendKeys("CHANDAN");
	}
	
	public void SendPhone ()
	{
		Phone.sendKeys("9158132112");
	}

	public void SendPinCodeAddress ()
	{
		PinCodeAddress.sendKeys("425306");
	}
	
	public void SendAddresss ()
	{
		Addresss.sendKeys("AT POST CHINCHOL, TAL MUKTAINAGAR");
	}
	
	
	public void SendCity ()
	{
		City.sendKeys("MUKTAINAGAR");
	}

	public void ClickOnState ()
	{
		State.click();
	}

	public void ClickOnMaharashta ()
	{
		Maharashta.click();
	}
	
	public void ClickOnLocationTypeTag ()
	{
		LocationTypeTag.click();
	}
	
	public void ClickOnSaveDeliver ()
	{
		SaveDeliver.click();
	}
	
	

}
