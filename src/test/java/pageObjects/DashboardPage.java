package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath="//h6[text()='Dashboard']") WebElement img_dashboard;
	@FindBy (xpath="//img[@alt='client brand banner']") WebElement img_OrangeHRM_menu;
	
	public boolean img_dashboard_logo()
	{
		return img_dashboard.isDisplayed();
	}
	
	
	
	
}
