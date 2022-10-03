package MAVEN_IRCTC;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IRCTC_BOOK_TICKET {
	
	private WebDriver driver ;
	private Actions Mouse ;
	
	
	
	@FindBy ( xpath = "//button[text()='OK']" ) 
	private WebElement OK;
	
	@FindBy ( xpath = "//input[@aria-autocomplete='list']" ) 
	private WebElement From;
	
	@FindBy ( xpath = "//span[text()='BHUSAVAL JN - BSL']" ) 
	private WebElement Bhusaval;
	
	@FindBy ( xpath = "//input[@aria-controls='pr_id_2_list']" ) 
	private WebElement To;
	
	@FindBy ( xpath = "//span[text()='MUMBAI CENTRAL - MMCT']" ) 
	private WebElement Mumbai;
	
	@FindBy ( xpath = "//input[contains(@class,'ng-tns-c58-10 ui-in')]" ) 
	private WebElement date;
	
	@FindBy ( xpath = "//span[contains(@class,'ui-datepicker-next-icon pi pi')]" ) 
	private WebElement next;
	
	@FindBy ( xpath = "//a[text()='29']" ) 
	private WebElement date29;
	
	@FindBy ( xpath = "//button[text()='Search']" ) 
	private WebElement Search;
	
	@FindBy ( xpath = "(//div[text()=' Refresh '])[115]" ) 
	private WebElement Refresh;
	
	@FindBy ( xpath = "((//div[@tabindex='0'])[119]//div)[2]" ) 
	private WebElement available;
	
	@FindBy ( xpath = "(//button[text()=' Book Now '])[32]" ) 
	private WebElement book;
	
	
	
	
	public IRCTC_BOOK_TICKET (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions (driver);
	}
	
	
	
	public void ClickOnOK ()
	{
		OK.click();
	}

	public void SendFrom ()
	{
		From.sendKeys("Bhusaval");
	}
	
	public void ClickOnBhusaval ()
	{
		Bhusaval.click();
	}

	public void SendTo ()
	{
		To.sendKeys("Mumbai");
	}
	
	public void ClickOnMumbai ()
	{
		Mumbai.click();
	}
	
	public void ClickOndate ()
	{
		date.click();
	}
	
	public void ClickOnnext ()
	{
		next.click();
	}
	
	public void ClickOndate29 ()
	{
		date29.click();
	}
	
	public void ClickOnSearch ()
	{
		Search.click();
	}
	
	public void ClickOnRefresh ()
	{
		Mouse.moveToElement(Refresh).build().perform();
		Refresh.click();
	}
	
	public void MouseActionavailable () throws InterruptedException
	{
		Mouse.moveToElement(available).perform();
		Thread.sleep(6000);
		available.click();
	}
	
	public void MouseActionbook()
	{
		Mouse.moveToElement(book).perform();
		Mouse.click().perform();
	}

}
