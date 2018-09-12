package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {
WebDriver driver;
public LandingPage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH, using="//*[@id=\"li_myaccount\"]/a)[2]") WebElement loginBtnClick;	
@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]") WebElement loginDropDown;
@FindBy(how=How.XPATH,using="//input[@name='username']") WebElement emailIdTxtBox;
@FindBy(how=How.XPATH,using="//input[@name='password']") WebElement passwordTxtBox;
@FindBy(how=How.XPATH,using="//button[text()='Login']") WebElement loginButton;

//*[@id=\"li_myaccount\"]/a)[2]

//public void loginbtn_click() {
//	loginBtnClick.click();
//}
//
//public void logindropdown_click() {
//	loginDropDown.click();
//}
//public void emailTextBox_click(String email) {
//	emailIdTxtBox.click();
//	emailIdTxtBox.sendKeys(email);
//}
//
//public void passwordTextBox_click(String password) {
//	passwordTxtBox.click();
//	passwordTxtBox.sendKeys(password);
//	
//}
//
//public void loginButton_click() {
//	loginButton.click();
//}


}
