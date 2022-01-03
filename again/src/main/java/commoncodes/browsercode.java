package commoncodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsercode {
	public static WebDriver driver;
	
	


	public static void main(String[] args) {
		System.out.println("browserscode");   
		browsers("chrome");    //calling the browsers function in the main method and adding the parameter
		
		driver.get("https://www.facebook.com");
		findfblinks();   //calling the function to extract href attributes/urls
		
		
	}
		
	
		//here I created a method/function with an argument and used function equalsignorecase
		//
	
		public static void browsers(String browsername) {
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
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonia\\git\\repositoryboot\\finalboot\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
}
		//here I created a function/method where I am extracting all the urls from the page.
		
		public static void findfblinks() {
			List<WebElement> listoflinks=driver.findElements(By.tagName("a"));  //the a tag has all the urls, saving them all in a list 
			System.out.println("total links are" + listoflinks.size()); //getting how many elements are saved in this list
			for (int i=0;i<listoflinks.size();i++) {
				System.out.println(listoflinks.get(i).getAttribute("href")); //href attribute has all the urls values and here we are  extracting all the values 
			}
}
}