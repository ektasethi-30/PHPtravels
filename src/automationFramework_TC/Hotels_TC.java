package automationFramework_TC;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonClass;
import common.ReadFile;
import common.TestAnnotationElements;
import common.Utility;
import pageObjects.Hotels;

public class Hotels_TC extends CommonClass {
	Utility util =new Utility();
	ReadFile rf=new ReadFile();
	String temp;
	
	
	
	
	public void Checkinmonthpicker(String string) throws InterruptedException {
		String getmonths=null;
		for(int i=1;i<=11;i++) {
		WebElement months = driver.findElement(By.xpath("//span[@class='month']["+i+"]")); 
		getmonths = months.getText();
		System.out.println(getmonths);
		
		try {
			
			
			if(getmonths.contentEquals(rf.readProperties(string))) {
			months.click();
			break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	public void Checkindatepicker(String string) throws Exception {
		String getdays=null;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=7;col++) {
			WebElement days=driver.findElement(By.xpath("//*/div[@class='datepicker dropdown-menu']/div[@class='datepicker-days']/table/tbody/tr["+row+"]/td["+col+"]"));
			getdays=days.getText();
			System.out.println(getdays);
			try {
			
			if(getdays.contentEquals(rf.readProperties(string))) {
				days.click();
			}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			}
			
		}
		
	}
	public void Checkoutmonthpicker(String string) throws InterruptedException {
		String getmonths=null;
		for(int i=1;i<=11;i++) {
		WebElement months = driver.findElement(By.xpath("//*/div[@class='datepicker-months']//tbody/tr/td/span["+i+"]")); 
		getmonths = months.getText();
		System.out.println(getmonths);
		
		try {
			
			
			if(getmonths.contentEquals(rf.readProperties(string))) {
			months.click();
			break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
	
	public void Checkoutdatepicker(String string) throws Exception {
		String getdays=null;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=7;col++) {
			WebElement days=driver.findElement(By.xpath("//*/div[@class='datepicker dropdown-menu']/div[@class='datepicker-days']//tbody/tr["+row+"]/td["+col+"]"));
			getdays=days.getText();
			System.out.println(getdays);
			try {
			
			if(getdays.contentEquals(rf.readProperties(string))) {
				days.click();
			}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			}
			
		}
		
	}
	
	@Test(priority=1)
	public void tc_hotelBook() throws Exception{
		Hotels hotel=PageFactory.initElements(driver, Hotels.class);
		Thread.sleep(5000);
		hotel.hotels.click();
		hotel.place.click();
		util.ActionClassWrite(hotel.place, driver, "New Delhi");
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*/div/span[text()='New Delhi']")).click();
		hotel.checkin.click();
		hotel.calenderyearList1.click();
		Checkinmonthpicker("checkinmonth");
		hotel.checkin.click();
		Checkindatepicker("checkindate");
		Thread.sleep(5000);
		hotel.person.click();
		hotel.addPerson.click();
		hotel.search.click();
		//driver.findElement(By.xpath("//div[@class='search_head']"));
		
//		hotel.checkout.click();
//		hotel.calenderyearList2.click();
//		Checkinmonthpicker("checkoutmonth");
//		hotel.checkout.click();
//		Checkoutmonthpicker("checkoutmonth");
		
		
		
		
		/*List<WebElement> elements=driver.findElements(By.xpath("/html/body/div[8]/div[2]/table/tbody/tr[1]/td/span"));
		System.out.println(elements);
		for(WebElement ele:elements) {
			if(ele.getText()=="Sep")
				ele.click();
		}*/
	
		
		
		/*Hotels hotel=PageFactory.initElements(driver, Hotels.class);
		hotel.hotelsSelect();
		hotel.focusPlaceTextBox();
		hotel.enterPlace("New Delhi");
		hotel.checkin();
		hotel.checkout();*/
		
	}
	@Test(priority=2)
	public void collapseDropdown() throws InterruptedException {
		Hotels hotel=PageFactory.initElements(driver, Hotels.class);
		hotel.hotels.click();
		Thread.sleep(5000);
		//util.mousehover(driver, hotel.starGradeHover);
		hotel.starGradeSelect.click();
		
		hotel.collapseStarGrade.click();
//		Thread.sleep(5000);
//		hotel.collapsePriceRange.click();
//		Thread.sleep(2000);
//		hotel.collapsePropertyTypes.click();
//		Thread.sleep(2000);
//		hotel.collapseAmmenities.click();
//		Thread.sleep(2000);
		
	}
}

