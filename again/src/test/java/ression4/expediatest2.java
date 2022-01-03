package ression4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class expediatest2 {
	public static WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		browsers("chrome");
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	  }
	
	@Test (priority=1)
  public void test1() throws InterruptedException {
		expediapage ob=new expediapage(driver);
	
		ob.clickonflights();
		  Thread.sleep(2000);
		  ob.clickfrom();
		  Thread.sleep(2000);
		  ob.enterfrom();
		  Thread.sleep(2000);
		  ob.clickto();
		  Thread.sleep(2000);
		  ob.enterto();
		  Thread.sleep(2000);
		  ob.calendar();
		  Thread.sleep(2000);
		  ob.clickjan18();
		  ob.clickjan29();
		  Thread.sleep(2000);
		  ob.clickdone();
		  Thread.sleep(2000);
		  ob.clicksearch();
		  
		//added explicit wait to handle the captcha manually
		  ob.flight1click();
		  Thread.sleep(2000);
		  
		  ob.clickflight2();
		  Thread.sleep(3000);
		  ob.clickreturnflight();
		  Thread.sleep(2000);
		  ob.selectreturnflight();
		  Thread.sleep(2000);
		  ob.clicknothanks();
		  Thread.sleep(2000);
	}
		  
		  @Test (priority=2)
		  public void test2() throws InterruptedException {
			  
		  Set <String> tabsession=driver.getWindowHandles();
		  Iterator<String>itr= tabsession.iterator();
		  
		  
		  String tab1= itr.next();
		  String tab2=itr.next();
		  
		  Thread.sleep(2000);
		  driver.switchTo().window(tab2);
		  Thread.sleep(2000);
		  expediapage ob1=new expediapage(driver);
		  ob1.checkoutclick();
		  Thread.sleep(2000);
		  ob1.entername1();
		  Thread.sleep(2000);
		  ob1.selectcountry();
		  Thread.sleep(2000);
		  ob1.enterphone();
		  Thread.sleep(2000);
		  ob1.clickmonth();
		  
		  
		  
		
		 
	  }
  


  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

  
  public static void browsers(String browsername) {
	  if(browsername.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonia\\eclipse-workspace\\finalboot\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
	  }
	  else {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\sonia\\eclipse-workspace\\finalboot\\drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
  }
}
