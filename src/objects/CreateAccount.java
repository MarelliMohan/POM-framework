package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

	WebDriver driver;
	
public CreateAccount(WebDriver driver)
{
	this.driver=driver;
}


public WebElement createui()
{
	WebElement ui=driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
	return ui;
}

public WebElement fullName()
{
	WebElement fullName=driver.findElement(By.xpath("//input[contains(@name,'name')]"));
	return fullName;
	
}
}
