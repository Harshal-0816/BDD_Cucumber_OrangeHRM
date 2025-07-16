package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	//constructor
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy (xpath="//input[@name='username']") WebElement txt_username;
	@FindBy (xpath="//input[@name='password']") WebElement txt_password;
	@FindBy (xpath="//button[text()=' Login ']") WebElement btn_login;
	@FindBy (xpath="//img[@alt='company-branding']") WebElement img_logo;
	
	public void enter_username(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enter_password(String password) 
	{
		txt_password.sendKeys(password);
	}
	
	public void click_login()
	{
		btn_login.click();
	}
	
	public boolean img_OrangeHRM_logo()
	{
		try 
		{
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(img_logo));
	        return img_logo.isDisplayed();
	    } 
		catch (Exception e) {
	        System.out.println("Logo not found or not visible: " + e.getMessage());
	        return false;
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
}
