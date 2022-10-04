package TEST;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MAVEN_FLIPKART.FLIPKART_GROCERY;
import MAVEN_FLIPKART.FLIPKART_KEYBOARD_BUY;
import MAVEN_FLIPKART.FLIPKART_LOG_IN;

public class TEST_FLIPKART {
	
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		
	public static void main(String[] args) throws InterruptedException {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Flipkart.com");
		
		FLIPKART_LOG_IN flipkartlogin = new FLIPKART_LOG_IN(driver);
		
		FLIPKART_GROCERY flipkartgrocery = new FLIPKART_GROCERY(driver);
		
		FLIPKART_KEYBOARD_BUY flipkartkeyboardbuy = new FLIPKART_KEYBOARD_BUY(driver);
		
//		Set<String> Address1 = driver.getWindowHandles();
//		
//		ArrayList<String> Address = new ArrayList<String> (driver.getWindowHandles() );
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		flipkartlogin.ClickOnCross();
		
//		flipkartlogin.ClickOnLogIn();
//		
//		flipkartlogin.MouseActionMyProfile();
//		
//		flipkartlogin.SendUserId();
//		
//		flipkartlogin.SendPassword();
//		
//		flipkartlogin.ClickOnLogIn();
		
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
		
//		flipkartgrocery.MouseActionElectronics();
//		
//		flipkartgrocery.MouseActionAccessories();
//		
//		flipkartgrocery.MouseActionKeyboards();
		
		flipkartgrocery.ClickOnSearch1();
		
		flipkartgrocery.ClickOnSearchButton1();
		
		flipkartgrocery.ClickOnZEBRONICS();
		
		Set<String> Address1 = driver.getWindowHandles();
		
		ArrayList<String> Address = new ArrayList<String> (driver.getWindowHandles() );
		
		driver.switchTo().window(Address.get(1));
		
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

}
