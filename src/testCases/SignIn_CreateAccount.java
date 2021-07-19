package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objects.CreateAccount;
import objects.SignIn;

public class SignIn_CreateAccount {
	
	@Test
	public void signIn()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marelli.mohan\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		

		SignIn  si=new SignIn(driver);
		si.userName();
		si.userName().sendKeys("Hello");
		si.passWord().sendKeys("Hello");
		si.signIN().click();

		CreateAccount ca=new  CreateAccount(driver);
		ca.createui().click();
		ca.fullName().sendKeys("Hello");
		driver.close();
	
	}

}
