package automationFramework_TC;
import common.CommonClass;
import common.ReadFile;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LandingPage;
import pageObjects.SignupPage;
public class HomePage_TC extends CommonClass{
	
	String actualText;
	String expectedText;
	
	HomePage home=PageFactory.initElements(driver, HomePage.class);
	SignupPage sign=PageFactory.initElements(driver, SignupPage.class);
	
	@Test(priority=4)													//Login
	public void login() throws Exception{	

//		landingPage.loginbtn_click();
//		landingPage.logindropdown_click();
//		landingPage.emailTextBox_click("user@phptravels.com");
//		landingPage.passwordTextBox_click("demouser");
//		landingPage.loginButton_click();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver+"testcase");
		home.loginBtnClick.click();
		home.loginDropDown.click();
		home.emailIdTxtBox.click();
		home.emailIdTxtBox.sendKeys("user@phptravels.com");
		home.passwordTxtBox.click();
		home.passwordTxtBox.sendKeys("demouser");
		home.loginButton.click();
		

		
	}
	
	@Test(priority=1)													//Sign up on submit button click
	public void signupFail1() throws Exception{
		
		
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		System.out.println(tabs2);
//		driver.switchTo().window(tabs2.get(1));
		
		
//		LandingPage landingPage=PageFactory.initElements(driver, LandingPage.class);
		
		
//		landingPage.loginbtn_click();
		
		//SignupPage signup=PageFactory.initElements(driver, SignupPage.class);
//		signup.signup_click();
//		signup.submitBtn_click();
		
		
		home.loginBtnClick.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sign.signup.click();
		sign.signup.submit();
		actualText=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		
		ReadFile rf=new ReadFile();
		expectedText=rf.readProperties("SignupFail1");
		assertEquals(actualText,expectedText);
		
	}
	
	@Test(priority=2)													//only First name is entered
	public void signupFail2() throws Exception{
		
//		LandingPage landingPage=PageFactory.initElements(driver, LandingPage.class);
//		landingPage.loginbtn_click();
//		SignupPage signup=PageFactory.initElements(driver, SignupPage.class);
//		signup.signup_click();
//		signup.firstnameTxtBox_click("User");;
//		signup.submitBtn_click();

		home.loginBtnClick.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sign.signup.click();
		sign.firstName.click();
		sign.firstName.sendKeys("User");
		sign.submitBtn.click();
		actualText=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		ReadFile rf=new ReadFile();
		expectedText=rf.readProperties("SignupFail2");
		assertEquals(actualText,expectedText);
	}
	
	@Test(priority=3)
	public void signupSuccess() throws Exception {
//		LandingPage landingPage=PageFactory.initElements(driver, LandingPage.class);
//		landingPage.loginbtn_click();
//		SignupPage signup=PageFactory.initElements(driver, SignupPage.class);
//		signup.signup_click();
//		signup.firstnameTxtBox_click("User");;
//		signup.lastnameTxtBox_click("one");
//		signup.emailTxtBox_click("abc@mailinator.com");
//		signup.mobilenumberTxtBox_click("2222222222");
//		signup.passwordTxtBox_click("user1@");
//		signup.confirmPasswordTxtBox_click("user1@");
//		signup.submitBtn_click();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home.loginBtnClick.click();
		sign.signup.click();
		sign.firstName.click();
		sign.firstName.sendKeys("User");
		sign.lastName.click();
		sign.lastName.sendKeys("one");
		sign.email.click();
		sign.email.sendKeys("abc@mailinator.com");
		sign.mobileNumber.click();
		sign.mobileNumber.sendKeys("2222222222");
		sign.password.click();
		sign.password.sendKeys("user@1");
		sign.confirmPassword.click();
		sign.confirmPassword.sendKeys("user@1");
		sign.submitBtn.click();

	}
}
