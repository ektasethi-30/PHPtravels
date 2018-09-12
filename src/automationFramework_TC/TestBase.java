package automationFramework_TC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

public class TestBase {
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void initialize() throws IOException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ekta Sethi\\eclipse-workspace\\PHPTravelsAutomation\\drivers\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//div/a/small[text()='http://www.phptravels.net']")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs2);
		driver.switchTo().window(tabs2.get(1));
	}
}
		
//		WebElement element=driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[@class='go-text-right dropdown-toggle']"));
//		Select oselect=new Select(element);
//		oselect.selectByValue("Arabic");
//		driver.findElement(By.xpath("//*[@id='ar']")).click();
	
	
//	@AfterTest
//	public void beforeTest() throws IOException{
//		driver.close();
//		
//	}
//	
//	@AfterSuite
//	 public void TeardownTest()
//	    {
//		
//	        TestBase.driver.quit();
//	    }

