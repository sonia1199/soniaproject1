package ression4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hdelements {
public static WebDriver driver;

@FindBy(xpath="//*[@class='MyAccount__button']")WebElement myaccnt;
@FindBy(xpath="//*[text()='Register']")WebElement register;
@FindBy(xpath="(//*[@class='bttn__content'])[1]")WebElement persaccnt;
@FindBy(xpath="//*[@id='email']")WebElement emailfield;
@FindBy(xpath="//*[@id='password-input-field']")WebElement passwordfield;
@FindBy(xpath="//*[@id='zipCode']")WebElement zipcode;
@FindBy(xpath="//*[@id='phone']")WebElement phone;
@FindBy(xpath="(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")WebElement clicker;
@FindBy(xpath="//*[@class='bttn__content']")WebElement createaccnt;








public hdelements(WebDriver driver) {   //page factory constructor
	hdelements.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickmyaccnt() {
	myaccnt.click();
	
}

public void clickregister() {
	register.click();
}

public void personalaccnt() {
	persaccnt.click();
	
}

public void emailtxt(String et) {
	emailfield.sendKeys(et);
}

public void passtxt(String pt) {
	passwordfield.sendKeys(pt);
}
public void ziptxt(String zt) {
	zipcode.sendKeys(zt);
}
public void phonenumber(String num) {
	phone.sendKeys(num);
}

public void clicktoggle() {
	clicker.click();
}

public void clickcreate() {
	createaccnt.click();
}
}



