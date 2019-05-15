package Academy;

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

public class validateTitle extends base {
    public static Logger Log=LogManager.getLogger(validateTitle.class.getName());// need to import two header files, keep in mind
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intializeDriver();
		Log.info("Driver is intialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to HomePage");
	}
	
	
	
	@Test
	public void basePageTitle() throws IOException
	{
	     //Two methods of implementing other classes, one is inheritance and 
	 	// other is by creating objects
	     LandingPage l=new LandingPage(driver);
	     //Compare the text of the browser with the actual text .--Error
	     //String expectedTitle="Featured Courses";
         Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
         Log.info("Successfully validated the Title");
        }
	
	
	@AfterTest
	public void teardown()
	{ 
		//closing the browser
		driver.close();
		driver=null;
	}
	
       
         }
        	 
         
        
         
         
	

	

