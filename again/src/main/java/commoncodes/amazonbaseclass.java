package commoncodes;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class amazonbaseclass implements ITestListener {  //here we are implementing interface itestlistener to do something on test failure and success
	
	@Override                                             //listeners will be in the commoncode/base class
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((amazonbaseclass)result.getInstance()).driver;   //adding this syntax to connect listener with driver and make driver nonstatic!
		try {
			shots("passed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((amazonbaseclass)result.getInstance()).driver;
		try {
			shots("failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public WebDriver driver;

  @BeforeTest
  public void beforeTest() throws InterruptedException, IOException {
	  browsers("firefox");
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	
	  
	  
  }
	 
	  
  

  @AfterTest
  public void afterTest() throws IOException, InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.close();
  }
  
  public void browsers(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonia\\git\\repositoryboot\\finalboot\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sonia\\git\\repositoryboot\\finalboot\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sonia\\git\\repositoryboot\\finalboot\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		}

		
		public void shots(String folder1) throws IOException {
			// File capture=((TakesScreenshot)driver) 
			Date dt=new Date();
			 String datetext=dt.toString().replace(" ", "-").replace(":", "-");	  
		           System.out.println(datetext);
			    File ssf = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileHandler.copy(ssf, new File("C:\\Users\\sonia\\eclipse-workspace\\again\\screenshot\\"+folder1+"\\"+datetext+".png"));



		}
}
	  
  


