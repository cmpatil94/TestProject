package MAVEN_EMI_CALCULATOR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TESTAUTOMATION {
	
	WebDriver driver ;
	Actions Mouse ;
	
	
	@FindBy ( xpath = "//button[@onclick='myFunction()']" ) 
	private WebElement Alert;
	
	
	@FindBy ( xpath = "//input[@id='datepicker']" ) 
	private WebElement Date;
	
	@FindBy ( xpath = "//select[@id='speed']" ) 
	private WebElement SelectSpeed;
	
	@FindBy ( xpath = "(//select[@id='speed']//option)[5]" ) 
	private WebElement Speed;
	
	@FindBy ( xpath = "//select[@id='files']" ) 
	private WebElement SelectFile;
	
	@FindBy ( xpath = "(//select[@id='files']//option)[2]" ) 
	private WebElement SelectFilepdf;
	
	@FindBy ( xpath = "//select[@id='number']" ) 
	private WebElement SelectNumber;
	
	@FindBy ( xpath = "(//select[@id='number']//option)[2]" ) 
	private WebElement SelectNumber2;
	
	@FindBy ( xpath = "//select[@id='products']" ) 
	private WebElement SelectProduct;
	
	@FindBy ( xpath = "(//select[@id='products']//option)[1]" ) 
	private WebElement SelectProductGoogle;
	
	@FindBy ( xpath = "//select[@id='animals']" ) 
	private WebElement SelectAnimals;
	
	@FindBy ( xpath = "(//select[@id='animals']//option)[1]" ) 
	private WebElement SelectAnimalsBigCat;
	
	@FindBy ( xpath = "//input[@id='field1']" ) 
	private WebElement SelectField1;
	
	@FindBy ( xpath = "//input[@id='field2']" ) 
	private WebElement SelectField2;
	
	@FindBy ( xpath = "//div[@id='draggable']" ) 
	private WebElement Drag;
	
	@FindBy ( xpath = "//div[@id='droppable']" ) 
	private WebElement Drop;
	
	@FindBy ( xpath = "//img[@alt='the peaks of high tatras']" ) 
	private WebElement Male;
	
	@FindBy ( xpath = "//div[@id='trash']" ) 
	private WebElement Trash;
	
	@FindBy ( xpath = "//img[@alt='The chalet at the Green mountain lake']" ) 
	private WebElement Female;
	
	@FindBy ( xpath = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']" ) 
	private WebElement Resize;
	
	@FindBy ( xpath = "//input[@id='age']" ) 
	private WebElement age;
	
	
	
	
	
	public TESTAUTOMATION (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		Mouse = new Actions(driver);
	}
	
	
	
	
	public void ClickOnAlert () throws InterruptedException
	{
		Alert.click();
	}

	public void ClickOnDate ()
	{
		Date.click();
		Date.sendKeys("12/12/2012");
		Date.sendKeys(Keys.ENTER);
	}
	
	public void ClickOnSelectSpeed ()
	{
		SelectSpeed.click();
	}

	public void ClickOnSpeed ()
	{
		Speed.click();
	}
	
	public void ClickOnSelectFile ()
	{
		SelectFile.click();
	}
	
	public void ClickOnSelectFilepdf ()
	{
		SelectFilepdf.click();
	}
	
	public void ClickOnSelectNumber ()
	{
		SelectNumber.click();
	}
	
	public void ClickOnSelectNumber2 ()
	{
		SelectNumber2.click();
	}
	
	public void ClickOnSelectProduct ()
	{
		SelectProduct.click();
	}

	public void ClickOnSelectProductGoogle ()
	{
		SelectProductGoogle.click();
	}

	public void SelectAnimals ()
	{
		SelectAnimals.click();
	}
	
	public void ClickOnSelectAnimalsBigCat ()
	{
		SelectAnimalsBigCat.click();
		
	}
	
	
	public void ClickOnSelectField1 ()
	{
		SelectField1.clear();
		SelectField1.sendKeys("Amit Selenium");
	}
	
	public void ClickOnSelectField2 ()
	{
		SelectField2.sendKeys("Mukesh Selenium");
	}
	
	public void ClickDragAndDrop ()
	{
		Mouse.dragAndDrop(Drag, Drop);
	}
	
	public void DragToTrash ()
	{
		Mouse.dragAndDrop(Male, Trash);
	}

	public void DragToTrash2 ()
	{
		Mouse.dragAndDrop(Female, Trash);
	}
	
	public void ClickResize ()
	{
		Mouse.clickAndHold().perform();
	}

	public void Sendage ()
	{
		age.sendKeys("27");
	}
	
	
	
	
	
	
	
	
	
	

}
