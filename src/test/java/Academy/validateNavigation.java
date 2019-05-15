package Academy;

import static org.testng.Assert.assertNotNull;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateNavigation extends base {
	public static Logger Log=LogManager.getLogger(validateNavigation.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intializeDriver();
		Log.info("Webdriver is intialized successfully");
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
	     //Two methods of implementing other classes, one is inheritance and 
	 	// other is by creating objects
	     LandingPage l=new LandingPage(driver);
	     //Compare the text of the browser with the actual text .
        Assert.assertTrue(l.checkContact().isDisplayed());
        Log.info("Successfully checked the Navigation Bar");
        System.out.println(l.checkContact().getText());
        
         


         
	}
	
	
	@AfterTest
	public void teardown()
	{ 
		//closing the browser
		driver.close();
		driver=null;
		
	}
	
       
         }
        	 
         
        
         
         
	

	

