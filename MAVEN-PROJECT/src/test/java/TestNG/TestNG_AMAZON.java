package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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
import MAVEN_AMAZON.AMAZON_CROME_WASHING_MACHINE;
import MAVEN_AMAZON.AMAZON_HOME_PAGE;
import MAVEN_AMAZON.AMAZON_LOG_IN_MOBILE_SELECT;
import MAVEN_AMAZON.AMAZON_ONEPLUS_BUY;
import MAVEN_AMAZON.AMAZON_ONEPLUS_NORD;
import Utils.Utility;

public class TestNG_AMAZON {
	
	private WebDriver driver ;
	
	private int testID;
	
	AMAZON_LOG_IN_MOBILE_SELECT amazonloginmobileselect ;
	AMAZON_ONEPLUS_BUY amazononeplusbuy ;
	AMAZON_CROME_WASHING_MACHINE amazoncromewashingmachine ;
	AMAZON_ONEPLUS_NORD amazononeplusnord ;
	AMAZON_HOME_PAGE amazonhomepage ;

	
	
	
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
		amazonloginmobileselect = new AMAZON_LOG_IN_MOBILE_SELECT(driver);
		
		amazononeplusbuy = new AMAZON_ONEPLUS_BUY(driver);
		
		amazoncromewashingmachine = new AMAZON_CROME_WASHING_MACHINE(driver);
		
		amazononeplusnord = new AMAZON_ONEPLUS_NORD(driver) ;
		
		amazonhomepage = new AMAZON_HOME_PAGE(driver);
	}
	
	
	
	
	@BeforeMethod
	public void OpenWebSite ()
	{
		driver.get("https://www.amazon.in/ref=nav_logo");	
	}
	
	
	@Test
	public void c1 ()
	{
		testID = 3001 ;
		
		amazonloginmobileselect.ClickOnSelect();
		
		amazonloginmobileselect.SendSignIN();
		
		amazonloginmobileselect.ClickOnContinue();
		
		amazonloginmobileselect.SendPassword();
		
		amazonloginmobileselect.ClickOnCheckBox();
		
		driver.navigate().back();
		driver.navigate().back();
		
		amazonloginmobileselect.ClickOnMobile();
		
		amazonloginmobileselect.ClickOnOnePlus();
		
		
		Set<String> Address1 = driver.getWindowHandles();
		
		ArrayList<String> Address = new ArrayList<String> (driver.getWindowHandles() );
		
		driver.switchTo().window(Address.get(1));
		
		
		amazononeplusbuy.ClickOnBuy();
		
		amazononeplusbuy.SendBuyNowSignIN();
		
		amazononeplusbuy.ClickOnBuyNowContinue();
		
		amazononeplusbuy.SendBuyNowPassword();
		
		amazononeplusbuy.ClickOnSignIN1();
		
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
	}
	
	
	@Test
	public void c2 ()
	{
		testID = 3002 ;
		
		amazoncromewashingmachine.SendSerchWashingMachiene();
		
		amazoncromewashingmachine.ClickOnCromeWashingMachineSerch();
		
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	}
	
	
	@Test
	public void c3 ()
	{
		testID = 3003 ;
		
		amazononeplusnord.ClickOnSearch();
		
		amazononeplusnord.ClickOnClickButton();
		
		amazononeplusnord.ClickOnOnePlusNord();
		
		amazononeplusnord.ClickOnClear();
		
		amazononeplusnord.ClickOnClick();
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	}
	
	
	@Test
	public void c4 ()
	{
		testID = 3004 ;
		
		amazonhomepage.ClickOnAmazonHome();
		
		
		try
		{
		amazonhomepage.ClickOnCreateAccount();
		
		amazonhomepage.ClickOnCode();
		
		amazonhomepage.ClickOnSelect1();
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}
	
	
	
	
	@Test
	public void c5 ()
	{
		testID = 3005 ;
		
		amazonhomepage.ClickOnAccountList();
		
		amazonhomepage.ClickOnSignIN2();
		
		amazonhomepage.ClickOnSignIN3();
		
		amazonhomepage.ClickOnHome();
		
		amazonhomepage.ClickOnLanguage();
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		System.out.println("Amazon OK");
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
		amazonloginmobileselect = null;
		
		amazononeplusbuy = null;
		
		amazoncromewashingmachine = null;
		
		amazononeplusnord = null;
		
		amazonhomepage = null;
	}
	
	@AfterTest
	public void CloseBrowser ()
	{
		driver.close();
		
		driver = null ;
		
		System.gc();  
	}

}
