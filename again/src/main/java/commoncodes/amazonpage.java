package commoncodes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class amazonpage {
public static WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")WebElement searchbox;
	@FindBy(xpath="//*[@id='nav-search-submit-button']")WebElement searchbutton;
	@FindBy(xpath="//*[text()='Step2 Neat & Tidy Cottage Homestyle Edition | Modern Kids Playhouse with Interactive Features, White']")WebElement cutehouse;
	@FindBy(xpath="//*[@class='a-button a-spacing-small a-button-primary a-button-icon']")WebElement addtocart;
	
	
	
	
	public amazonpage(WebDriver driver) {
		amazonpage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchthis() throws InterruptedException {
		searchbox.click();
		Thread.sleep(2000);
		searchbox.sendKeys("playhouse");
		Thread.sleep(2000);
				
		
	}
	
	public void hitsearch() {
		searchbutton.click();
		
	}
	public void clickhouse() {
		cutehouse.click();
	}
	
	public void clickaddcart() {
		addtocart.click();
	}

}
