package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	

public WebDriver driver2;

By login=By.cssSelector("a[href*='sign_in']");
By title=By.cssSelector(".text-center>h2");
By part=By.xpath("//a[@href='contact.php']");

public LandingPage(WebDriver driver)
{
	this.driver2=driver;
}

public WebElement LoginClick() {
	
	
	return driver2.findElement(login);
}
public WebElement getTitle() {
	
	
	return driver2.findElement(title);
}

public WebElement checkContact() {
	
	
	return driver2.findElement(part);
}


}