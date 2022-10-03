package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MAVEN_FLIPKART.FLIPKART_SEARCH_PRODUCT_DETAIL_FUCTIONALTY;


public class TEST_FLIPKART_SEARCH_PRODUCT_FUCTIONALITY {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\INSTALL\\SELENIUM\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		FLIPKART_SEARCH_PRODUCT_DETAIL_FUCTIONALTY flipkartSearchProductDetail = new FLIPKART_SEARCH_PRODUCT_DETAIL_FUCTIONALTY(driver);
		
		 
		
		flipkartSearchProductDetail.ClickOnCross();
		
		flipkartSearchProductDetail.ClickOnSearch();
		
		flipkartSearchProductDetail.ClickOnSearchButton();
		
		flipkartSearchProductDetail.SendPrductName();
		
		flipkartSearchProductDetail.ClickOnSearchButton();
		
		flipkartSearchProductDetail.ClickOnProductSearch();
		
		flipkartSearchProductDetail.ClickOnProduct();
		
		flipkartSearchProductDetail.ClickOnRating();
		
		
		
		
		
		
		
		
}
}
