package StepDefinitions;

import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToHomePageSteps extends Testbase {
	
	//Testbase testBase= new Testbase();
	LoginPage loginPage ;
	HomePage homePage;
	
	
	
	@Given("^User opens Browser$")
	public void user_opens_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//testBase.driverInitialization();
		driverInitialization();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		loginPage= new LoginPage();
		//loginPage.enterCredentials(testBase.prop.getProperty("userName"), testBase.prop.getProperty("password"));
		loginPage.enterCredentials(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Then("^User clicks to login button$")
	public void user_clicks_to_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.clickLoginButton();
	}

	@Then("^Validate user is on homePage$")
	public void validate_user_is_on_homePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage = new HomePage();
		homePage.verifyHomePageTitle();
	}

	@Then("^Validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag = homePage.corretUserName();
		Assert.assertTrue(flag);
	}
	
	@Then("^User clicks on Contacts link$")
	public void User_clicks_on_Contacts_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickContactsLink();
	}
	

}
