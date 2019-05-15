package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	
	public static WebDriver driver;    //Global variable declaration--can be used in other classes also
	public Properties prop;     //Global variable declaration--can be used in derived other classes also
	public WebDriver intializeDriver() throws IOException
	{
		
		//chrome, Firefox or IE
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ROYAL COMPUTER\\Project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		
       if(browserName.equalsIgnoreCase("chrome"))
    {  
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROYAL COMPUTER\\Downloads\\chromedriver.exe");
		   driver=new ChromeDriver();
		
	}
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// implicit wait is used to keep the user waiting incase website contains 
       return driver;//lot of images and whole of the website gets loaded.
       
       
}
	
	public void getscreenShot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C://Users//ROYAL COMPUTER//Desktop//test//"+ result +"screenshot.png"));
		
	}
}
