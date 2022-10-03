package TestNG;
import java.io.IOException;
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
import MAVEN_YOUTUBE.YOUTUBE_LOG_IN;
import MAVEN_YOUTUBE.YOUTUBE_RADHE_RADHE;
import MAVEN_YOUTUBE.YOUTUBE_RASHMIKA_MANDANA;
import Utils.Utility;

public class TestNG_YOUTUBE {
	
	private WebDriver driver ;
	
	private int testID;
	
	private YOUTUBE_LOG_IN youtubelogin ;
	
	private YOUTUBE_RADHE_RADHE youtuberadheradhe ;
	
	private YOUTUBE_RASHMIKA_MANDANA youtuberashmika ;
	
	
	
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
	public void a () 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
	}
	
	
	@BeforeMethod
	public void b () 
	{
		driver.get("https://www.youtube.com");
		
		youtubelogin = new YOUTUBE_LOG_IN(driver);
		
		youtuberadheradhe = new YOUTUBE_RADHE_RADHE(driver);
		
		youtuberashmika = new YOUTUBE_RASHMIKA_MANDANA(driver);
	}
	
	
	
	@Test (priority = 1)
	public void Open_Radhe_Radhe () throws InterruptedException 
	{
		testID = 4001 ;
		
		youtuberadheradhe.ClickOnLive();
		
		youtuberadheradhe.ClickOnsong();
		
		youtuberadheradhe.SendSearch2();
		
		youtuberadheradhe.ClickOnSearchButton2();
		
		youtuberadheradhe.ClickOnSearchButton1();
		
		youtuberadheradhe.SendSearch1();
		
		Thread.sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		String Title = driver.getTitle();
		
		if (URL.equals("https://www.youtube.com/watch?v=9IwqM1ohAcA") && Title.equals("राधाकृष्ण के 14 मधुर गीत - YouTube") )
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	
	
	@Test (priority = 2)
	public void Open_Rashmika_TopTucker_Song () throws InterruptedException 
	{
		testID = 4002 ;
		
		youtuberashmika.SendSearch();
		
		youtuberashmika.ClickOnSearchButton();
		
		youtuberashmika.ClickOnVideo();
		
		youtuberashmika.ClickOnFilter();
		
		youtuberashmika.ClickOnToday();
		
		youtuberashmika.ClickOnImage();
		
//		youtuberashmika.ClickOnOpen();
		
		
		Thread.sleep(7000);
		
		String URL2 = driver.getCurrentUrl();
		
		String Title2 = driver.getTitle();
		
		
		if (URL2.equals("https://www.youtube.com/watch?v=bY8bEaJp3x8") && (Title2.equals("Top Tucker Song | Uchana Amit | Ft. | Badshah, Yuvan Shankar Raja, Rashmika Mandanna | Jonita Gandhi - YouTube")) )
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
		youtubelogin = null;
		
		youtuberadheradhe = null;
		
		youtuberashmika = null;
	}
	
	@AfterTest
	public void CloseBrowser ()
	{
		driver.close();
		
		driver = null ;
		
		System.gc();  
	}
	
	
	

}
