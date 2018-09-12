package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage {
	
	public static final String currency ="//ul[@class='nav navbar-nav navbar-right']//a[@class='go-text-right dropdown-toggle']//ul//li[@rel='6']";
	public static final String hotels="//a[@title='Hotels']";
	public static final String starGrade="//div[@class='listingbg']/../button[@type='button']";
	public static final String place="//*[@id='s2id_autogen1']"; 
	public static final String checkin="//*[@placeholder='Check in']";
	public static final String checkout="//input[@placeholder='Check out']";
	public static final String calendernext="//*/tr/th[@class='next']";
	public static final String calenderyearList1="(/html/body/div[8]/div[1]/table/thead/tr[1]/th[2])";
	public static final String calenderyearList2="/html[1]/body[1]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[2]";
	public static final String calendermonthList="(//span[@class='month'])";
	public static final String person="//input[@id='travellersInput']";
	public static final String addPerson="//button[@id='adultPlusBtn']";
	public static final String search="//button[@type='submit']/i[@class='icon_set_1_icon-66']";
	public static final String collapseStarGrade="//button[@data-target='#collapse1']";
	public static final String collapsePriceRange="//button[@data-target='#collapse2']";
	public static final String collapsePropertyTypes="//button[@data-target='#collapse3']";
	public static final String collapseAmmenities="//button[@data-target='#collapse4']";
	public static final String starGradeHover="//div[@class='iradio_square-grey']/input[@id='4']";
	public static final String starGradeSelect="/html[1]/body[1]/div[4]/div[5]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[7]/label[1]";
	//public static final String calendermonthList="//th[contains(text(),'September 2018')]";
	
	

}
