package MAVEN_FACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FACEBOOK_LOG_IN_OR_SIGN_UP {
	
	
		@FindBy ( xpath = "//input[@name='email']" ) 
		private WebElement UserID;
		
		@FindBy ( xpath = "//input[@id='pass']" ) 
		WebElement Password;
		
		@FindBy ( xpath = "//button[@type='submit']" ) 
		WebElement Submit;
		
		@FindBy ( xpath = "//a[@aria-label='Marketplace']//span" ) 
		WebElement MarketPlace;
		
		@FindBy ( xpath = "(//a[@aria-label='Groups']//span)[1]" ) 
		WebElement Group;
		
		@FindBy ( xpath = "//a[@aria-label='Notifications, 2 unread']//div" ) 
		WebElement Notification;
		
		@FindBy ( xpath = "(//div[@aria-label='Messenger']//div)[1]" ) 
		WebElement Messenger;
		
		@FindBy ( xpath = "//input[@placeholder='Search Facebook']" ) 
		WebElement Search;
		
		@FindBy ( xpath = "//a[@aria-label='Home']//div" ) 
		WebElement Home;
		
		
		@FindBy ( xpath = "(//a[text()='Forgotten password?'])[2]" ) 
		WebElement ForgotPassword;
		
		@FindBy ( xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']" ) 
		WebElement CreateNewAccount;
	
		
		
		public FACEBOOK_LOG_IN_OR_SIGN_UP (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void SendUserID ()
		{
			UserID.sendKeys("cmpatil94@gmail.com");
		}

		public void SendPassword ()
		{
			Password.sendKeys("Facebook@2147");
		}
		
		public void ClickOnSubmit ()
		{
			Submit.click();
		}
		
		public void ClickOnMarketPlace ()
		{
			MarketPlace.click();
		}

		public void ClickOnGroup ()
		{
			Group.click();
		}
		
		public void ClickOnNotification ()
		{
			Notification.click();
		}
		
		public void ClickOnMessenger ()
		{
			Messenger.click();
		}

		public void SendSearch ()
		{
			Search.sendKeys("SOFTWARE TESTING");
		}
		
		public void ClickOnHome ()
		{
			Home.click();
		}
		
		public void ClickOnCreateNewAccount ()
		{
			CreateNewAccount.click();
		}

}
