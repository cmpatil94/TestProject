package TEST;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import MAVEN_AMAZON.AMAZON_CROME_WASHING_MACHINE;
import MAVEN_AMAZON.AMAZON_HOME_PAGE;
import MAVEN_AMAZON.AMAZON_LOG_IN_MOBILE_SELECT;
import MAVEN_AMAZON.AMAZON_ONEPLUS_BUY;
import MAVEN_AMAZON.AMAZON_ONEPLUS_NORD;


public class TEST_AMAZON {
	
		
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
	
	public static void main(String[] args) {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
			
			
			
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		AMAZON_LOG_IN_MOBILE_SELECT amazonloginmobileselect = new AMAZON_LOG_IN_MOBILE_SELECT(driver);
		
		AMAZON_ONEPLUS_BUY amazononeplusbuy = new AMAZON_ONEPLUS_BUY(driver);
		
		AMAZON_CROME_WASHING_MACHINE amazoncromewashingmachine = new AMAZON_CROME_WASHING_MACHINE(driver);
		
		AMAZON_ONEPLUS_NORD amazononeplusnord = new AMAZON_ONEPLUS_NORD(driver) ;
		
		AMAZON_HOME_PAGE amazonhomepage = new AMAZON_HOME_PAGE(driver);
		
		
		
		
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
		
		driver.switchTo().window(Address.get(0));
		
		amazoncromewashingmachine.SendSerchWashingMachiene();
		
		amazoncromewashingmachine.ClickOnCromeWashingMachineSerch();
		
		
		amazononeplusnord.ClickOnSearch();
		
		amazononeplusnord.ClickOnClickButton();
		
		amazononeplusnord.ClickOnOnePlusNord();
		
		amazononeplusnord.ClickOnClear();
		
		amazononeplusnord.ClickOnClick();
		
		
		driver.switchTo().window(Address.get(0));
		
		
		amazonhomepage.ClickOnCreateAccount();
		
		amazonhomepage.ClickOnCode();
		
		amazonhomepage.ClickOnSelect1();
		
		amazonhomepage.ClickOnAmazonHome();
		
		amazonhomepage.ClickOnAccountList();
		
		amazonhomepage.ClickOnSignIN2();
		
		amazonhomepage.ClickOnSignIN3();
		
		amazonhomepage.ClickOnHome();
		
		amazonhomepage.ClickOnLanguage();
		
		System.out.println("Amazon OK");
		
		
		
		
			

}
}
