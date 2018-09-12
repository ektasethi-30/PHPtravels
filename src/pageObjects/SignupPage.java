package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.Configuration;
import pageElements.SignUpPageElements;

public class SignupPage {
	WebDriver driver = Configuration.driver;


@FindBy(xpath=SignUpPageElements.signup)
public WebElement signup;

@FindBy(xpath=SignUpPageElements.submitBtn)
public WebElement submitBtn;

@FindBy(xpath=SignUpPageElements.firstName)
public WebElement firstName;

@FindBy(xpath=SignUpPageElements.lastName)
public WebElement lastName;

@FindBy(xpath=SignUpPageElements.mobileNumber)
public WebElement mobileNumber;

@FindBy(xpath=SignUpPageElements.email)
public WebElement email;

@FindBy(xpath=SignUpPageElements.password)
public WebElement password;

@FindBy(xpath=SignUpPageElements.confirmPassword)
public WebElement confirmPassword;


//public void signup_click() {
//	signup.click();
//}
//
//public void submitBtn_click() {
//	submitBtn.click();
//}
//
//public void firstnameTxtBox_click(String text) {
//	firstName.click();
//	firstName.sendKeys(text);
//}
//
//public void lastnameTxtBox_click(String text){
//	lastName.click();
//	lastName.sendKeys("text");
//}
//public void passwordTxtBox_click(String text){
//	password.click();
//	password.sendKeys("text");
//}
//
//public void confirmPasswordTxtBox_click(String text){
//	confirmPassword.click();
//	confirmPassword.sendKeys("text");
//}
//
//public void emailTxtBox_click(String text){
//	email.click();
//	email.sendKeys("text");
//}
//
//public void mobilenumberTxtBox_click(String text){
//	mobileNumber.click();
//	mobileNumber.sendKeys("text");
//}
}


