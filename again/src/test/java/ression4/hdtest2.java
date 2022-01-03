package ression4;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class hdtest2 {
	public static WebDriver driver;
	
	
	  @BeforeTest
	  @Parameters({"url"})
	  public void beforeTest(String url) throws InterruptedException {
		  browsers("chrome");
		  driver.get(url);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  
	  }
	
  @Test
  public void f() throws InterruptedException {
	  
	  hdelements ob=new hdelements (driver);
	  ob.clickmyaccnt();
	  Thread.sleep(2000);
	  ob.clickregister();
	  Thread.sleep(2000);
	  ob.personalaccnt();
	  Thread.sleep(2000);
	  ob.emailtxt("soniaghad1199@gmail.com");
	  Thread.sleep(2000);
	  ob.passtxt("aaaaaa");
	  Thread.sleep(2000);
	  ob.ziptxt("22181");
	  Thread.sleep(2000);
	  ob.phonenumber("7035317002");
	  Thread.sleep(2000);
	  ob.clicktoggle();
	  Thread.sleep(2000);
	  ob.clickcreate();
	  Thread.sleep(2000);
	  
	  
	  
}
  

	  
	  
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  public static void browsers(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonia\\eclipse-workspace\\finalboot\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sonia\\eclipse-workspace\\finalboot\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "/Users/sonia/eclipse-workspace_11272021/facebook/driver/chromedriver");
			driver=new FirefoxDriver();
		}

  }
}
