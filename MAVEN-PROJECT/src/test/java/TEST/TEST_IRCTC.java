package TEST;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import MAVEN_IRCTC.IRCTC_BOOK_TICKET;
import MAVEN_IRCTC.IRCTC_FLIGHT;

public class TEST_IRCTC {
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	public static void main(String[] args) throws InterruptedException {
		
	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
		
	System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.irctc.co.in/nget/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	IRCTC_BOOK_TICKET irctcbookticket = new IRCTC_BOOK_TICKET(driver);
	
	IRCTC_FLIGHT irctcFlight = new IRCTC_FLIGHT(driver) ;
	
	
	
	
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
	System.out.println(EndUrl);
	
	String EndTitle = driver.getTitle();
	System.out.println(EndTitle);
	
	if ( (EndUrl.equals("https://www.irctc.co.in/nget/booking/train-list") ) && (EndTitle.equals("IRCTC Next Generation eTicketing System")) )
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	
	
	
	
	String StartUrlFlight = driver.getCurrentUrl();
	System.out.println(StartUrlFlight);
	
	String StartTitleFlight = driver.getTitle();
	System.out.println(StartTitleFlight);
	
	
	irctcFlight.MouseActionFlightClick();
	
	irctcFlight.ClickOnLaterButton();
	
	irctcFlight.SendFrom();
	
	irctcFlight.SendTo();
	
	irctcFlight.ClickOnDeparture();
	
	irctcFlight.SendMonth();
	
	irctcFlight.SendDate17();
	
	irctcFlight.ClickOnSearch();
	
	
	String EndUrlFlight = driver.getCurrentUrl();
	
	String EndTitleFlight = driver.getTitle();
	System.out.println(EndTitleFlight);
	
	if ( (EndUrlFlight.equals("https://www.irctc.co.in/nget/booking/train-list") ) && (EndTitleFlight.equals("IRCTC Next Generation eTicketing System")) )
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	
	
	}
}
