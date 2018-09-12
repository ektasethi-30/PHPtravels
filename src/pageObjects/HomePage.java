package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.Configuration;
import pageElements.HomePageElements;

public class HomePage {
	
	WebDriver driver = Configuration.driver;
	
//	@FindBy(how=How.XPATH, using="//div/a/small[text()='http://www.phptravels.net']") WebElement linkFrontEnd;	
//	@FindBy(how=How.XPATH, using="//div[text()='http://www.phptravels.net/admin']") WebElement linkBackEnd;
//	@FindBy(how=How.XPATH, using="//div[text()='http://www.phptravels.net/supplier']") WebElement linkSupplier;
//	@FindBy(xpath="//a[@title='Hotels']") WebElement hotels;
	
	
	@FindBy(xpath=HomePageElements.linkFrontEnd)
	public WebElement linkFrontEnd;
	
	@FindBy(xpath=HomePageElements.linkBackEnd)
	public WebElement linkBackEnd;
	
	@FindBy(xpath=HomePageElements.linkSupplier)
	public WebElement linkSupplier;
	
	@FindBy(xpath=HomePageElements.loginBtnClick)
	public WebElement loginBtnClick;
	
	@FindBy(xpath=HomePageElements.loginDropDown)
	public WebElement loginDropDown;
	
	@FindBy(xpath=HomePageElements.emailIdTxtBox)
	public WebElement emailIdTxtBox;
	
	@FindBy(xpath=HomePageElements.passwordTxtBox)
	public WebElement passwordTxtBox;
	
	@FindBy(xpath=HomePageElements.loginButton)
	public WebElement loginButton;
	
	
	
//	public void linkFrontEnd_click() {
//		linkFrontEnd.click();
//	}
//	
//	public void linkbackEnd_click() {
//		linkBackEnd.click();
//	}
//	
//	public void linkSupplier_click() {
//		linkSupplier.click();
//	}
	
//	public void hotelsSelect() {
//		hotels.click();
//	}
}
