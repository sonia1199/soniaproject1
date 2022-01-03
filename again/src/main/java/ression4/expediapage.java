package ression4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expediapage {
	public static WebDriver driver;
	
	@FindBy(xpath="(//*[@class='uitk-tab-anchor'])[1]")WebElement flightstab;
	@FindBy(xpath="//*[@aria-label='Leaving from']")WebElement fromwhere;
	@FindBy(xpath="//*[@id='location-field-leg1-origin']")WebElement enterfromwhere;
	@FindBy(xpath="//*[@aria-label='Going to']")WebElement towhere;
	@FindBy(xpath="//*[@id='location-field-leg1-destination']")WebElement entertowhere;
	@FindBy(xpath="//*[@id='d1-btn']")WebElement day1;
	@FindBy(xpath="(//*[@data-day='18'])[1]")WebElement jan18;
	@FindBy(xpath="//*[@data-day='29']")WebElement jan29;
	@FindBy(xpath="//*[@data-stid='apply-date-picker']")WebElement donebutt;
	@FindBy(xpath="(//*[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'])[1]")WebElement searchbutton;
	@FindBy(xpath="(//*[@data-test-id='select-link'])[1]")WebElement flight1;
	@FindBy(xpath="//*[@class='uitk-button uitk-button-large uitk-button-has-text uitk-button-primary uitk-spacing uitk-spacing-margin-blockstart-six']")WebElement flight2;
    @FindBy(xpath="(//*[@data-test-id='select-link'])[1]")WebElement returnflight;
	@FindBy(xpath="//*[@data-test-id='select-button']")WebElement selectreturn;
	@FindBy(xpath="//*[@data-test-id='forcedChoiceNoThanks']")WebElement nothanks;
	@FindBy(xpath="//*[@data-test-id='goto-checkout-button']")WebElement checkout;
	@FindBy(xpath="//*[@id='firstname[0]']")WebElement firstname;
	@FindBy(xpath="//*[@id='lastname[0]']")WebElement lastname;
	@FindBy(xpath="//*[@class='cko-field always-include gb-whitelist alpha3CountryCode']")WebElement select1;
	@FindBy(xpath="//*[@id='phone-number[0]']")WebElement phone;
	@FindBy(xpath="//*[@class='cko-field date-of-birth-month compound-validation main-traveler']")WebElement month;
	
	
	
	
	
public expediapage(WebDriver driver) {
	expediapage.driver=driver;
	PageFactory.initElements(driver, this);
	
}


public void clickonflights() {
	flightstab.click();
	
}
public void clickfrom() {
	fromwhere.click();
	
}
public void enterfrom() {
	enterfromwhere.sendKeys("DCA");
	enterfromwhere.sendKeys(Keys.ENTER);
}

public void clickto() {
	towhere.click();
	}

public void enterto() {
	entertowhere.sendKeys("Miami,Florida");
	entertowhere.sendKeys(Keys.ENTER);
	
}


public void calendar() {
	day1.click();
}

public void clickjan18() {
	jan18.click();
	
}

public void clickjan29() {
	jan29.click();
}

public void clickdone() {
	donebutt.click();
}
public void clicksearch() {
	searchbutton.click();
}


public void flight1click() {
	//explicit wait added here so I can handle the CAPTCHA manually and then script will continue
	WebDriverWait ob=new WebDriverWait(driver,50);
	ob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@data-test-id='select-link'])[1]"))).click();	


}
public void clickflight2() {
	flight2.click();
}

public void clickreturnflight() {
	returnflight.click();
}

public void selectreturnflight() {
	selectreturn.click();
}
public void clicknothanks() {
	nothanks.click();
}


public void checkoutclick() {
	checkout.click();
}

public void entername1() {
	firstname.sendKeys("Sonia");
	lastname.sendKeys("Ghaderi");
}

public void selectcountry() throws InterruptedException {
	Select ob=new Select(select1);
	select1.click();
	ob.selectByValue("30");
	
}

public void enterphone() {
	phone.sendKeys("7035317002");
}

public void clickmonth() {
	Select sel=new Select(month);
	month.click();
	sel.selectByValue("05");
}
}







