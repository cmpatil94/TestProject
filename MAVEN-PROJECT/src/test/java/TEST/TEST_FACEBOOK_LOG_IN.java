package TEST;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import MAVEN_FACEBOOK.FACEBOOK_LOG_IN_OR_SIGN_UP;

public class TEST_FACEBOOK_LOG_IN {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");

		
		FACEBOOK_LOG_IN_OR_SIGN_UP facebooklogin = new FACEBOOK_LOG_IN_OR_SIGN_UP (driver);
		
		facebooklogin.SendUserID();
		
		facebooklogin.SendPassword();
		
		facebooklogin.ClickOnSubmit();
		
		Thread.sleep(5000);
		
		for(int i = 0 ; i < 7 ; i++)
		{
			String Date = new SimpleDateFormat("ddMMyyyyhhmmss").format(Calendar.getInstance().getTime());
		     
			String a = Date + ".jpg";
			
			System.out.println(a);
			
			
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
			File Save = new File("C:\\Users\\Admin\\Desktop\\ScreenShot\\"+ "test" + a);
		
			Thread.sleep(3000);
		
			FileHandler.copy(screenshot, Save);
	
		}
	}
		
		
	
}
