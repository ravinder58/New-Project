package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	

public WebDriver driver2;
 //defining objects
By email=By.id("user_email");
By password=By.id("user_password");
By login=By.cssSelector("[value='Log In']");
By loginPageTitle=By.xpath("/html/body/div/div/div/div/div/div/h1");
public LoginPage(WebDriver driver)
{
	this.driver2=driver;
}

public WebElement getemail() {
	
	
	return driver2.findElement(email);
}
public WebElement getpwd() {
	
	
	return driver2.findElement(password);
}

public WebElement getLogin() {
	
	
	return driver2.findElement(login);
}


public WebElement getLoginTitle()
{
	return driver2.findElement(loginPageTitle);
}
}