package StepDefinitions;

import com.pages.ContactsPage;
import com.util.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsPageSteps extends Testbase {
	
	ContactsPage contacts = new ContactsPage();
	
	@Given("^user is on contacts page$")
	public void user_is_on_contacts_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contacts.verifyContactsPage();
		Thread.sleep(5000);
	}

	@When("^user clicks on New Button$")
	public void user_clicks_on_New_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contacts.clickNewButton();
		Thread.sleep(5000);
		
	}

	@Then("^user moves to create new contact page$")
	public void user_moves_to_create_new_contact_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contacts.verifyCreateNewContactPage();
		Thread.sleep(5000);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String fName, String lName, String position) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contacts.enterNewContactDetails(fName, lName, position);
		Thread.sleep(5000);
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contacts.clickSaveButton();
	}

	@Then("^verify user able to see new contacts created\\.$")
	public void verify_user_able_to_see_new_contacts_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	
	
	
	
	
	
	

}
