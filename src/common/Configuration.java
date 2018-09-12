package common;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Configuration {
	public static WebDriver driver;
	
	
	public static WebDriver chrome(WebDriver driver) {
	
	
	
	
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ekta Sethi\\eclipse-workspace\\PHPTravelsAutomation\\drivers\\chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://phptravels.com/demo/");
			driver.findElement(By.xpath("//div/a/small[text()='http://www.phptravels.net']")).click();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			System.out.println(tabs2);
			driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getWindowHandle());
		   /*ChromeOptions options = new ChromeOptions();
		   options.addExtensions(new File(System.getProperty("user.dir") + "/src/test/resources/PDF-Viewer_v1.8.557.crx"));
		   DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
		   return driver;

}}
