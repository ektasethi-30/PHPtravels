package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Utility {
	public void enter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	
	
	public void ActionClassWrite(WebElement element, WebDriver driver, String text) {
		Actions performAct = new Actions(driver);
		performAct.sendKeys(element, text).build().perform();
	}
	
	public void ActionClassKey(WebElement element, WebDriver driver,Keys key) {
		Actions performAct=new Actions(driver);
		performAct.sendKeys(element,key).build().perform();
				
	}
	
	public void selectFromDropdown(WebElement element, String text) {
		Select dropdownvalue=new Select(element);
		dropdownvalue.selectByVisibleText(text);
		
	}
	
	public void mousehover(WebDriver driver,WebElement element) {
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		
	}

	
}




