package TestNG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import MAVEN_FLIPKART.FLIPKART_GROCERY;
import MAVEN_FLIPKART.FLIPKART_KEYBOARD_BUY;
import MAVEN_FLIPKART.FLIPKART_LOG_IN;
import Utils.Utility;

public class TestNG_FLIPKART {
	
		private WebDriver driver ;
		
		private FLIPKART_LOG_IN flipkartlogin ;
		private FLIPKART_GROCERY flipkartgrocery ;
		private FLIPKART_KEYBOARD_BUY flipkartkeyboardbuy ;
		private int testID ;
	
		
		@Parameters("BrowserName")
		@BeforeTest
		public void LaunchBrowser (String BrowserName)
		{
			
			if(BrowserName.equals("Chrome"))
			{
				driver = Utility.LaunchChromeBrowser();
			}
			
			if(BrowserName.equals("Firefox"))
			{
				driver = Utility.LaunchFirefoxBrowser();
			}
			
			if(BrowserName.equals("MicrosoftEdge"))
			{
				driver = Utility.LaunchMicrosoftEdgeBrowser();
			}
			
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
				driver.manage().window().maximize();
		}
		
		
		@BeforeClass
		public void CreatePOMObject ()
		{
			flipkartlogin = new FLIPKART_LOG_IN(driver);
			
			flipkartgrocery = new FLIPKART_GROCERY(driver);
			
			flipkartkeyboardbuy = new FLIPKART_KEYBOARD_BUY(driver);
		}
			
		
		@BeforeMethod
		public void OpenWebSite ()
		{
			driver.get("https://www.Flipkart.com");
		}
		
		
	
		@Test
		public void FlipkartLogingPage ()
		{
			 testID = 30010;
			
			flipkartlogin.ClickOnCross();
			
			flipkartlogin.ClickOnLogIn();
			
			flipkartlogin.MouseActionMyProfile();
			
			flipkartlogin.SendUserId();
			
			flipkartlogin.SendPassword();
			
			flipkartlogin.ClickOnLogIn();
		}
		
		
	
		@Test
		public void FlipkartGroceryPage () throws InterruptedException
		{
			testID = 30002;
			
			flipkartlogin.ClickOnCross();
			
			flipkartgrocery.ClickOnGrocery();
			
			flipkartgrocery.ClickOnPinCode();
			
			flipkartgrocery.ClickOnFacewash();
			
			flipkartgrocery.ClickOnLakme();
			
			flipkartgrocery.ClickOnAdd();
			
			flipkartgrocery.ClickOnDelete();
			
			flipkartgrocery.ClickOnLakmeAdd();
			
			flipkartgrocery.ClickOnCart();
			
			Thread.sleep(10000);
			driver.navigate().back();
			
			flipkartgrocery.ClickOnSoup();
			
			flipkartgrocery.ClickOnBodyWash();
			
			flipkartgrocery.ClickOnADD3();
			
			driver.navigate().back();
			driver.navigate().back();
			
//				flipkartgrocery.MouseActionElectronics();
//				
//				flipkartgrocery.MouseActionAccessories();
//				
//				flipkartgrocery.MouseActionKeyboards();
			
			flipkartgrocery.ClickOnSearch1();
			
			flipkartgrocery.ClickOnSearchButton1();
			
			flipkartgrocery.ClickOnZEBRONICS();
			
		}
		
		
	
		@Test
		public void FlipkartKeyboardPage ()
		{
			testID = 30003;
			
			Set<String> Address1 = driver.getWindowHandles();
			
			ArrayList<String> Address = new ArrayList<String> (driver.getWindowHandles() );
			
			driver.switchTo().window(Address.get(1));
			
			flipkartlogin.ClickOnCross();
			
			flipkartkeyboardbuy.ClickOnBuyNow();
			
			flipkartkeyboardbuy.SendEnterEMail();
			
			flipkartkeyboardbuy.ClickOnContinue();
			
			flipkartkeyboardbuy.SendPassword();
			
			flipkartkeyboardbuy.ClickOnSubmit();
			
			flipkartkeyboardbuy.ClickOnNewAddressForm();
			
			flipkartkeyboardbuy.SendName();
			
			flipkartkeyboardbuy.SendPhone();
			
			flipkartkeyboardbuy.SendPinCodeAddress();
			
			flipkartkeyboardbuy.SendAddresss();
			
			flipkartkeyboardbuy.SendCity();
			
			flipkartkeyboardbuy.ClickOnState();
			
			flipkartkeyboardbuy.ClickOnMaharashta();
			
			flipkartkeyboardbuy.ClickOnLocationTypeTag();
			
			flipkartkeyboardbuy.ClickOnSaveDeliver();
			
		}
		
		
	
		@AfterMethod
		public void e (ITestResult Result) throws InterruptedException, IOException
		{
			if (ITestResult.FAILURE == Result.getStatus())
			{
				Utility.CaptureScreenshot(driver, testID);
			}
		}
		
		
		@AfterClass
		public void RemoveObject ()
		{
			flipkartlogin = null ;
			
			flipkartgrocery = null ;
			
			flipkartkeyboardbuy = null ;
		}
		
		@AfterTest
		public void CloseBrowser ()
		{
			driver.close();
			
			driver = null ;
			
			System.gc();  
		}

}
