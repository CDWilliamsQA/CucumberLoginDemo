package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("the user is on the login page")
    public void user_on_login_page() {
        System.out.println("User navigates to login page");
    }

    @When("the user enters valid username and password")
    public void enter_credentials() {
        System.out.println("Entered valid username and password");
    }

    @When("clicks the login button")
    public void click_login_button() {
        System.out.println("Clicked login button");
    }

    @Then("the user should be redirected to the homepage")
    public void redirect_to_homepage() {
        System.out.println("User redirected to homepage");
    }
}
