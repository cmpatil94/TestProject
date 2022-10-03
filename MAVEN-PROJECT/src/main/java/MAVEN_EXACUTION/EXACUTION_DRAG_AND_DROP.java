package MAVEN_EXACUTION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EXACUTION_DRAG_AND_DROP {
	
	Actions Mouse ;
	
	
	
	@FindBy ( xpath = "//p[text()='Drag me to my target']" ) 
	private WebElement drag;
	
	@FindBy ( xpath = "//p[text()='Drop here']" ) 
	private WebElement drop;
	
	
	
	
	public EXACUTION_DRAG_AND_DROP (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		Mouse = new Actions(driver);
	}
	
	
	public void MouseActionDragAndDrop ()
	{
		Mouse.dragAndDrop(drag, drop).build().perform();
	}
	


}
