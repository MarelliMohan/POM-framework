package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;
	
public SignIn(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="login1")
private WebElement username;
@FindBy(id="password")
public WebElement password;
@FindBy(name="proceed")
private WebElement signIn;

public WebElement userName() 
{
	return username;
}

public WebElement passWord() 
{
	return password;
}
public WebElement signIN() 
{
	return signIn;
}
}
