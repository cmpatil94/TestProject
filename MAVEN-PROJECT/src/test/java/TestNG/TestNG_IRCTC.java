	package TestNG;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	import MAVEN_IRCTC.IRCTC_BOOK_TICKET;
	import MAVEN_IRCTC.IRCTC_FLIGHT;
	import Utils.Utility;
	
	
		
	public class TestNG_IRCTC {
		
		private WebDriver driver ;
		
		private IRCTC_BOOK_TICKET irctcbookticket ;
		
		private IRCTC_FLIGHT irctcFlight ;
		
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
		public void a()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		
		@BeforeMethod
		public void b()
		{
			driver.get("https://www.irctc.co.in/nget/");
			
			irctcbookticket = new IRCTC_BOOK_TICKET(driver);
			
			irctcFlight = new IRCTC_FLIGHT(driver) ;
		}
		
		
		
		
		@Test
		public void c () throws InterruptedException
		{
			String StartUrl = driver.getCurrentUrl();
			System.out.println(StartUrl);
			
			String StartTitle = driver.getTitle();
			System.out.println(StartTitle);
			
			irctcbookticket.ClickOnOK();
			
			irctcbookticket.SendFrom();
			
			irctcbookticket.ClickOnBhusaval();
			
			irctcbookticket.SendTo();
			
			irctcbookticket.ClickOnMumbai();
			
			irctcbookticket.ClickOndate();
			
			irctcbookticket.ClickOnnext();
			
			irctcbookticket.ClickOndate29();
			
			irctcbookticket.ClickOnSearch();
			
			irctcbookticket.ClickOnRefresh();
			
			irctcbookticket.MouseActionavailable();
			
			irctcbookticket.MouseActionbook();
			
			
			String EndUrl = driver.getCurrentUrl();
			
			String EndTitle = driver.getTitle();
			
			if ( (EndUrl.equals("https://www.irctc.co.in/nget/booking/train-list") ) && (EndTitle.equals("IRCTC Next Generation eTicketing System")) )
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
		}
		
		
		
		
		@Test
		public void d ()
		{
			String StartUrlFlight = driver.getCurrentUrl();
			System.out.println(StartUrlFlight);
			
			String StartTitleFlight = driver.getTitle();
			System.out.println(StartTitleFlight);
			
			
			irctcbookticket.ClickOnOK();
			
			irctcFlight.MouseActionFlightClick();
			
	//		irctcFlight.ClickOnLaterButton();
			
			irctcFlight.SendFrom();
			
			irctcFlight.SendTo();
			
			irctcFlight.ClickOnDeparture();
			
			irctcFlight.SendMonth();
			
			irctcFlight.SendDate17();
			
			irctcFlight.ClickOnSearch();
			
			
			String EndUrlFlight = driver.getCurrentUrl();
			System.out.println(EndUrlFlight);
			
			String EndTitleFlight = driver.getTitle();
			System.out.println(EndTitleFlight);
			
			if ( (EndUrlFlight.equals("https://www.air.irctc.co.in/") ) && (EndTitleFlight.equals("IRCTC Next Generation eTicketing System")) )
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
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
			irctcbookticket = null;
			
			irctcFlight = null ;
		}
		
		@AfterTest
		public void CloseBrowser ()
		{
			driver.close();
			
			driver = null ;
			
			System.gc();  
		}
		
	
	}
