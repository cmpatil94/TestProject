package TEST;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import MAVEN_EMI_CALCULATOR.TESTAUTOMATION;

public class TEST_TESTAUTOMATION {
	
	private WebDriver driver;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	
public static void main(String[] args) throws InterruptedException {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\INSTALL\\SELENIUM\\geckodriver.exe");
//	
//		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		TESTAUTOMATION testautomation = new TESTAUTOMATION(driver);
		
		
		
		testautomation.ClickOnAlert();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		testautomation.ClickOnDate();
		
		testautomation.ClickOnSelectSpeed();
		
		testautomation.ClickOnSpeed();
		
		testautomation.ClickOnSelectFile();
		
		testautomation.ClickOnSelectFilepdf();
		
		testautomation.ClickOnSelectNumber();
		
		testautomation.ClickOnSelectNumber2();
		
		testautomation.ClickOnSelectProduct();
		
		testautomation.ClickOnSelectProductGoogle();
		
		testautomation.SelectAnimals();
		
		testautomation.ClickOnSelectAnimalsBigCat();
		
		
		//TEST DATA
		
		for(int i = 2 ; i <= 7 ; i++)
			
		{
			List<WebElement> TestRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr["+ i +"]//td"));
			
			for (int a = 0 ; a < TestRow.size() ; a++)
			{
				System.out.print(TestRow.get(a).getText() + ", ");
			}
				System.out.println();
		}
		
		
		testautomation.ClickOnSelectField1();
		
		testautomation.ClickOnSelectField2();
		
		testautomation.ClickDragAndDrop();
		
		testautomation.DragToTrash();
		
		testautomation.DragToTrash2();
		
		testautomation.ClickResize();
		
		testautomation.Sendage();
		
		
		Thread.sleep(5000);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("https://testautomationpractice.blogspot.com/"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}

}
