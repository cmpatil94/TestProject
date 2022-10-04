package TEST;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MAVEN_YOUTUBE.YOUTUBE_LOG_IN;
import MAVEN_YOUTUBE.YOUTUBE_RADHE_RADHE;
import MAVEN_YOUTUBE.YOUTUBE_RASHMIKA_MANDANA;

public class TEST_YOUTUBE {
	
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
	
	public static void main(String[] args) throws InterruptedException {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		YOUTUBE_LOG_IN youtubelogin = new YOUTUBE_LOG_IN(driver);
		
		YOUTUBE_RADHE_RADHE youtuberadheradhe = new YOUTUBE_RADHE_RADHE(driver);
		
		YOUTUBE_RASHMIKA_MANDANA youtuberashmika = new YOUTUBE_RASHMIKA_MANDANA(driver);
		
		
		
		
//		youtubelogin.ClickOnSignIN();
//		
//		youtubelogin.SendUserID();
//		
//		youtubelogin.ClickOnNext();
//		
//		youtubelogin.SendPassword();
//		
//		youtubelogin.ClickOnClick();
		
		
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
		
		
		
		youtuberashmika.SendSearch();
		
		youtuberashmika.ClickOnSearchButton();
		
		youtuberashmika.ClickOnVideo();
		
		youtuberashmika.ClickOnFilter();
		
		youtuberashmika.ClickOnToday();
		
		youtuberashmika.ClickOnImage();
		
		
		
		Thread.sleep(5000);
		
		String URL2 = driver.getCurrentUrl();
		
		String Title2 = driver.getTitle();
		
		if (URL2.equals("https://www.youtube.com/watch?v=9IwqM1ohAcA") && Title2.equals("राधाकृष्ण के 14 मधुर गीत - YouTube") )
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
