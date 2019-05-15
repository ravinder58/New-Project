package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Homepage extends base {
 
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String username,String password) throws IOException
	{
	     //Two methods of implementing other classes, one is inheritance and 
	 	// other is by creating objects
	     LandingPage l=new LandingPage(driver);
         l.LoginClick().click();
         //Entering the LoginPge
         LoginPage lp=new LoginPage(driver);
         lp.getemail().sendKeys(username);
         lp.getpwd().sendKeys(password);
         lp.getLogin().click();
       //  Assert.assertEquals(lp.getLoginTitle().getText(),"Loginto QaClickAcademy");
        
	}
	
	 @AfterTest
  	public void teardown()
  	{ 
  		//closing the browser
  		driver.close();
  		driver=null;
  	}
         
	 @DataProvider
         
         public Object[][] getData()
         {
        	 Object[][] data=new Object[1][2];
        	 
        	 //Row stands for how many different data types should run
        	 //Column stands for how many values per each Test	
        	 
        	 //0th Row
        	 data[0][0]="nonrestricteduser@qa.com";
        	 data[0][1]="nonpassword";
        	 //1st Row
        	/* data[1][0]="restricteduser@qa.com";
        	 data[1][1]="password";*/
        	 
        	 return data;
         }
        	
}
