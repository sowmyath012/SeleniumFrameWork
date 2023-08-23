package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkTest {
WebDriver driver=null;
	
		@Test
		public void greet() {
			System.out.println("Welcome");
			/* String BROWSER =System.getProperty("browser");
			 String URL = System.getProperty("url");
			
			  if(BROWSER.equalsIgnoreCase("chrome"))
			   {
				   WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			   }
			  else if(BROWSER.equalsIgnoreCase("firefox"))
		      {
		    	  WebDriverManager.firefoxdriver().setup();
		      driver=new FirefoxDriver(); 
		      }
		     else 
		     {
		     driver=new ChromeDriver();
		    	  
		      }
			  driver.get(URL);*/
		}

	}


