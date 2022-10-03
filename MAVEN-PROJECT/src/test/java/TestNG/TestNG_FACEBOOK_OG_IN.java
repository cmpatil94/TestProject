package TestNG;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
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
import MAVEN_FACEBOOK.FACEBOOK_LOG_IN;
import Utils.Utility;


public class TestNG_FACEBOOK_OG_IN extends Utility {
	
	private WebDriver driver ;
	
	private FACEBOOK_LOG_IN facebooklogin ;
	
	private int testID ;
	
	private String Data;
	
	
	@Parameters("BrowserName")
	@BeforeTest
	public void LaunchBrowser (String BrowserName)
	{
		
		if(BrowserName.equals("Chrome"))
		{
			driver = LaunchChromeBrowser();
		}
		
		if(BrowserName.equals("Firefox"))
		{
			driver = LaunchFirefoxBrowser();
		}
		
		if(BrowserName.equals("MicrosoftEdge"))
		{
			driver = LaunchMicrosoftEdgeBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	
	@BeforeClass
	public void CreatePOMObject ()
	{
		facebooklogin = new FACEBOOK_LOG_IN (driver);
	}
	
	
	@BeforeMethod
	public void OpenWebSite()
	{
		driver.get("https://www.facebook.com");
		
	}
	
	
	@Test
	public void c1() throws EncryptedDocumentException, IOException
	{
		testID = 1001 ;
		
	    Data = ReadExcellFile("FacebookData", 1, 0);
		System.out.println(Data);
		
		facebooklogin.SendUserID1(Data);
		
		Data = ReadExcellFile("FacebookData", 1, 1);
		System.out.println(Data);
		
		facebooklogin.SendPassword1(Data);
		
		facebooklogin.ClickOnSubmit1();
	}
	
	
	@Test
	public void c2() throws EncryptedDocumentException, IOException
	{
		testID = 1002 ;
		
		 Data = ReadExcellFile("FacebookData", 2, 0);
		 System.out.println(Data);
			
		facebooklogin.SendUserID2(Data);
			
		Data = ReadExcellFile("FacebookData", 2, 1);
		System.out.println(Data);
			
		facebooklogin.SendPassword2(Data);
		
		facebooklogin.ClickOnSubmit2();
	}
	
	
	@Test
	public void c3()
	{
		testID = 1003 ;
		
		facebooklogin.SendUserID3();
		
		facebooklogin.SendPassword3();
		
		facebooklogin.ClickOnSubmit3();
	}
	
	
	@Test
	public void c4()
	{
		testID = 1004 ;
		
		facebooklogin.SendUserID4();
		
		facebooklogin.SendPassword4();
		
		facebooklogin.ClickOnSubmit4();
	}
	
	
	@Test
	public void c5()
	{
		testID = 1005 ;
		
		facebooklogin.SendUserID5();
		
		facebooklogin.SendPassword5();
		
		facebooklogin.ClickOnSubmit5();
	}
	
	
	@Test
	public void c6()
	{
		testID = 1006 ;
		
		facebooklogin.SendUserID6();
		
		facebooklogin.SendPassword6();
		
		facebooklogin.ClickOnSubmit6();
	}
	
	
	@Test
	public void c7()
	{
		testID = 1007 ;
		
		facebooklogin.SendUserID7();
		
		facebooklogin.SendPassword7();
		
		facebooklogin.ClickOnSubmit7();
	}
	
	
	
	@Test
	public void c8()
	{
		testID = 1008 ;
		
		facebooklogin.SendUserID8();
		
		facebooklogin.SendPassword8();
		
		facebooklogin.ClickOnSubmit8();
	}
	
	
	@Test
	public void c9()
	{
		testID = 1009 ;
		
		facebooklogin.SendUserID9();
		
		facebooklogin.SendPassword9();
		
		facebooklogin.ClickOnSubmit9();
	}
	
	
	@Test
	public void c10()
	{
		testID = 1010 ;
		
		facebooklogin.SendUserID10();
		
		facebooklogin.SendPassword10();
		
		facebooklogin.ClickOnSubmit10();
	}
	
	
	
	@Test
	public void c11()
	{
		testID = 1011 ;
		
		facebooklogin.SendUserID11();
		
		facebooklogin.SendPassword11();
		
		facebooklogin.ClickOnSubmit11();
	}
	
	
	@Test
	public void c12()
	{
		testID = 1012 ;
		
		facebooklogin.SendUserID12();
		
		facebooklogin.SendPassword12();
		
		facebooklogin.ClickOnSubmit12();
	}
	
	
	@Test
	public void c13()
	{
		testID = 1013 ;
		
		facebooklogin.SendUserID13();
		
		facebooklogin.SendPassword13();
		
		facebooklogin.ClickOnSubmit13();
	}
	
	
	@Test
	public void c14()
	{
		testID = 1014 ;
		
		facebooklogin.SendUserID14();
		
		facebooklogin.SendPassword14();
		
		facebooklogin.ClickOnSubmit14();
	}
	
	@Test
	public void c15()
	{
		testID = 1015 ;
		
		facebooklogin.SendUserID15();
		
		facebooklogin.SendPassword15();
		
		facebooklogin.ClickOnSubmit15();
	}
	
	
	@Test
	public void c16()
	{
		testID = 1016 ;
		
		facebooklogin.SendUserID16();
		
		facebooklogin.SendPassword16();
		
		facebooklogin.ClickOnSubmit16();
	}
	
	
	@Test
	public void c17()
	{
		testID = 1017 ;
		
		facebooklogin.SendUserID17();
		
		facebooklogin.SendPassword17();
		
		facebooklogin.ClickOnSubmit17();
	}
	
	
	@Test
	public void c18()
	{
		testID = 1018 ;
		
		facebooklogin.SendUserID18();
		
		facebooklogin.SendPassword18();
		
		facebooklogin.ClickOnSubmit18();
	}
	
	
	@Test
	public void c19()
	{
		testID = 1019 ;
		
		facebooklogin.SendUserID19();
		
		facebooklogin.SendPassword19();
		
		facebooklogin.ClickOnSubmit19();
	}
	
	
	@Test
	public void c20()
	{
		testID = 1020 ;
		
		facebooklogin.SendUserID20();
		
		facebooklogin.SendPassword20();
		
		facebooklogin.ClickOnSubmit20();
	}
	
	
	
//	@AfterMethod
//	public void x ()
//	{
//		facebooklogin.ClickOnMyProfile();
//		
//		facebooklogin.ClickOnLogOut();
//		
//		
//	}
	
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
		facebooklogin = null ;
	}
	
	
	@AfterTest
	public void CloseBrowser ()
	{
		driver.close();
		
		driver = null ;
		
		System.gc();  
	}
}
