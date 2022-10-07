package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	
	private WebDriver driver;
	
	private XSSFWorkbook Workbook ;
	
	private static String CellValue ;
	

	
	public static WebDriver LaunchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public static WebDriver LaunchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\INSTALL\\SELENIUM\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}
	
	public static WebDriver LaunchMicrosoftEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "E:\\INSTALL\\SELENIUM\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		return driver;
	}
	
	
	
	
	
	public static void CaptureScreenshot(WebDriver driver , int testID)  throws IOException  {
		
	
	String Date = new SimpleDateFormat("dd-MM-yyyy hh.mm.ss").format(Calendar.getInstance().getTime());
    
	String a = Date + ".jpg";
	
	System.out.println(a);
	
	
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	File Save = new File("C:\\Users\\Admin\\Desktop\\ScreenShot\\" + "Test-" + testID + " - " + a);

	FileHandler.copy(screenshot, Save);
	
	}


	



	public static String ReadExcellFile (String SheetName, int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		String Path = "C:\\Users\\Admin\\Desktop\\FacebookDataExcell.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		
		try 
		{
			CellValue = Workbook.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	
		}
		catch(Exception e)
		{
			double CellValueNo = Workbook.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
			
			CellValue = Double.toString(CellValueNo);
		
		}
		return CellValue;
		
		
	}
}