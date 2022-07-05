package bddAutomation.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	
	@Given("^user is on application page$")
	public void user_is_on_application_page() {
		System.out.println("Given is getting excecuted");
	}
	
//	@When("^user enter login ID and password$")
//	public void user_enter_login_ID_and_password () {
//		System.out.println("When is getting excecuted");
//	}

	
	@When("^user enter login ID and password with UID \"([^\"]*)\" and PWD=\"([^\"]*)\"$")
    public void user_enter_login_id_and_password_with_uid_something_and_pwdsomething(String strArg1, String strArg2) {
       System.out.println("When excute for : "+ strArg1);
    }

	
	@Then("^login page should displayed$")
	public void login_page_should_displayed(){
		System.out.println("Then is getting excuted");
	}


}






