package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import common.Configuration;
import common.TestAnnotationElements;
import common.Utility;
import pageElements.HotelsPage;
public class Hotels {
	
	WebDriver driver = Configuration.driver;

@FindBy(xpath=HotelsPage.currency) 
public WebElement currency;

@FindBy(xpath=HotelsPage.hotels) 
public WebElement hotels;

@FindBy(xpath=HotelsPage.starGrade) 
public WebElement starGrade;

@FindBy(xpath=HotelsPage.place) 
public WebElement place;

@FindBy(xpath=HotelsPage.checkin) 
public WebElement checkin;

@FindBy(xpath=HotelsPage.checkout) 
public WebElement checkout;

@FindBy(xpath=HotelsPage.calendernext)
public WebElement calendernext;

@FindBy(xpath=HotelsPage.calendermonthList)
public WebElement calendermonthList;

@FindBy(xpath=HotelsPage.calenderyearList1)
public WebElement calenderyearList1;

@FindBy(xpath=HotelsPage.calenderyearList2)
public WebElement calenderyearList2;

@FindBy(xpath=HotelsPage.person)
public WebElement person;

@FindBy(xpath=HotelsPage.addPerson)
public WebElement addPerson;

@FindBy(xpath=HotelsPage.search)
public WebElement search;

@FindBy(xpath=HotelsPage.collapseStarGrade)
public WebElement collapseStarGrade;

@FindBy(xpath=HotelsPage.collapsePriceRange)
public WebElement collapsePriceRange;

@FindBy(xpath=HotelsPage.collapsePropertyTypes)
public WebElement collapsePropertyTypes;

@FindBy(xpath=HotelsPage.collapseAmmenities)
public WebElement collapseAmmenities;

@FindBy(xpath=HotelsPage.starGradeSelect)
public WebElement starGradeSelect;

@FindBy(xpath=HotelsPage.starGradeHover)
public WebElement starGradeHover;





//public void currencySelect() {
//	currency.click();
//}

/*public void hotelsSelect() {
	hotels.click();
}

public void enterPlace(String text) {
	Utility util=new Utility();
	util.ActionClassWrite(place, driver, text);
}

public void checkin() {
	checkin.click();
}

public void checkout() {
	checkout.click();
}
public void focusPlaceTextBox() {
	place.click();
}
public void starGrade_MinMax() {
	starGrade.click();
}*/
}
