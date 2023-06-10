package TestNG;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MAVEN_EMI_CALCULATOR.TESTAUTOMATION;
import Utils.Utility;

public class TestNG_TESTAUTOMATION {
	
		private WebDriver driver ;
		
		private TESTAUTOMATION testautomation ;

		private int testID;
		
		
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
			testautomation = new TESTAUTOMATION(driver);
		}
			
		
		@BeforeMethod
		public void OpenWebSite ()
		{
			driver.get("https://testautomationpractice.blogspot.com/");
		}
		
		
		
		@Test
		public void TestAutomationPage () throws InterruptedException
		{
			testID = 5001 ;
			
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
			
			try
			{
				testautomation.ClickOnSelectField1();
				
				testautomation.ClickOnSelectField2();
				
				testautomation.ClickDragAndDrop();
				
				testautomation.DragToTrash();
				
				testautomation.DragToTrash2();
			
				testautomation.ClickResize();
			
			}
			catch(MoveTargetOutOfBoundsException e) 
			{
				System.out.println("MoveTargetOutOfBoundsException");
			}
			
			testautomation.Sendage();
			
			
			
			String URL = driver.getCurrentUrl();
			System.out.println(URL);
			
			assertEquals(URL, "https://testautomationpractice.blogspot.com/");
			
			
			if(URL.equals("https://testautomationpractice.blogspot.com/"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
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
			testautomation = null ;
		}
		
		@AfterTest
		public void CloseBrowser ()
		{
			driver.close();
			
			driver = null ;
			
			System.gc();  
		}
		
	}
