package MAVEN_FLIPKART;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLIPKART_GROCERY {
	
	WebDriver driver ;
	Actions Mouse ;
	
	
	@FindBy ( xpath = "//div[text()='Grocery']" ) 
	private WebElement Grocery;
	
	@FindBy ( xpath = "//input[@name='pincode']" ) 
	private WebElement PinCode;
	
	@FindBy ( xpath = "//a[text()='Face Wash']" ) 
	private WebElement Facewash;
	
	@FindBy ( xpath = "(//span[text()='Add Item'])[11]" ) 
	private WebElement Lakme;
	
	@FindBy ( xpath = "(//button[@class='_2KpZ6l _37Ieie'])[2]" ) 
	private WebElement Add;
	
	@FindBy ( xpath = "(//button[@class='_2KpZ6l _37Ieie'])[1]" ) 
	private WebElement Delete;
	
	@FindBy ( xpath = "(//span[text()='Add Item'])[11]" ) 
	private WebElement LakmeAdd;
	
	@FindBy ( xpath = "//span[text()='Cart']" ) 
	private WebElement Cart;
	
	@FindBy ( xpath = "//span[@class='_1S0WnB']" ) 
	private WebElement Soup;
	
	@FindBy ( xpath = "//span[text()='Body Wash']" ) 
	private WebElement BodyWash;
	
	@FindBy ( xpath = "(//span[text()='Add Item'])[17]" ) 
	private WebElement ADD3;
	
//	@FindBy ( xpath = "(//div[@class='xtXmba'])[4]" ) 
//	private WebElement Electronics;
//	
//	@FindBy ( xpath = "//a[text()='Laptop Accessories']" ) 
//	private WebElement Accessories;
//	
//	@FindBy ( xpath = "//a[text()='Laptop Keyboards']" ) 
//	private WebElement Keyboards;
	
	@FindBy ( xpath = "//input[@name='q']" ) 
	private WebElement Search1;
	
	@FindBy ( xpath = "//button[@type='submit']" ) 
	private WebElement SearchButton1;
	
	@FindBy ( xpath = "//a[text()='ZEBRONICS Zeb-K20 Wired USB Desktop Keyboard']" ) 
	private WebElement ZEBRONICS;
	
	
	
	
	public FLIPKART_GROCERY (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	public void ClickOnGrocery ()
	{
		Grocery.click();
	}

	public void ClickOnPinCode ()
	{
		PinCode.sendKeys("425306");
		PinCode.sendKeys(Keys.ENTER);
	}
	
	public void ClickOnFacewash ()
	{
		Facewash.click();
	}

	public void ClickOnLakme ()
	{
		Lakme.click();
	}
	
	public void ClickOnAdd ()
	{
		Add.click();
		Add.click();
	}
	
	
	public void ClickOnDelete ()
	{
		Delete.click();
		Delete.click();
	}

	public void ClickOnLakmeAdd ()
	{
		LakmeAdd.click();
	}
	
	public void ClickOnCart ()
	{
		Cart.click();
	}

	public void ClickOnSoup ()
	{
		Soup.click();
	}
	
	public void ClickOnBodyWash ()
	{
		BodyWash.click();
	}
	
	
	public void ClickOnADD3 ()
	{
		ADD3.click();
	}

//	public void MouseActionElectronics ()
//	{
//		Mouse.moveToElement(Electronics).perform();
//	}
//	
//	public void MouseActionAccessories ()
//	{
//		Mouse.moveToElement(Accessories).perform();
//	}
//
//	public void MouseActionKeyboards ()
//	{
//		Mouse.moveToElement(Keyboards).click().build().perform();
//	}
	
	public void ClickOnSearch1 ()
	{
		Search1.sendKeys("ZEBRONICS Zeb-K20 Wired USB Desktop Keyboard");
	}
	
	public void ClickOnSearchButton1 ()
	{
		SearchButton1.click();
	}
	
	
	public void ClickOnZEBRONICS ()
	{
		ZEBRONICS.click();
	}

}
