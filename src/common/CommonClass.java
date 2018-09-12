package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import automationFramework_TC.TestBase;
import pageObjects.Hotels;
import pageObjects.SignupPage;
import pageObjects.HomePage;

public class CommonClass {
public static WebDriver driver = Configuration.driver;

//public Hotels hotel=PageFactory.initElements(driver, Hotels.class);
//public Hotels hotel = new Hotels();

//public HomePage home=new HomePage();
//public SignupPage sign=new SignupPage();

/*@BeforeClass
public void beforClass() {
	Configuration.chrome(driver);
}

@AfterTest
public void afterTest() {
	Configuration.chrome(driver);
}

*/
@BeforeTest
public void beforeTest() {
	try {
		driver=Configuration.chrome(driver);
		
	}
	catch(Exception e)
	{
		driver=Configuration.chrome(driver);
	}
}


/*@BeforeMethod
public void beforeMethod() {
	try {
		driver=Configuration.chrome(driver);
	}
	catch(Exception e)
	{
		driver=Configuration.chrome(driver);
	}

	
}*/

/*@AfterMethod
public void aftermethod() {
	driver.close();
}*/



@AfterSuite
 public void TeardownTest()
    {
	
        TestBase.driver.quit();
    }
	
}
