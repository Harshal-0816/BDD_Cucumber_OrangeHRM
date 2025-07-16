package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage lp;
	DashboardPage db;

	@Given("User is on Login page")
	public void user_is_on_login_page() throws InterruptedException {
	    
		BaseClass.getLogger().info("****User is on the Login Page****");
		
		lp = new LoginPage(BaseClass.getDriver());
		
		boolean ornageHRM_logo_status=lp.img_OrangeHRM_logo();
		BaseClass.getLogger().info("****Validating the Logo****");
		Assert.assertEquals(true, ornageHRM_logo_status);
	}

	@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		
        lp = new LoginPage(BaseClass.getDriver());
        
        BaseClass.getLogger().info("****User is entering the Username and Password****");
		lp.enter_username(username);
		lp.enter_password(password);
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		
		lp= new LoginPage(BaseClass.getDriver());
		
		lp.click_login();
		BaseClass.getLogger().info("****User licked on the Login Button****");
	    
	}
	
	@Then("User should be redirected to OrangeHRM Dashboard Page")
	public void user_should_be_redirected_to_orange_hrm_dashboard_page() {
		
		db = new DashboardPage(BaseClass.getDriver());
		
		boolean dashboad_logo_status=db.img_dashboard_logo();
		BaseClass.getLogger().info("****Validating the Dashboard Logo****");
		Assert.assertEquals(dashboad_logo_status, true);

	}
	
	
	
		
}
