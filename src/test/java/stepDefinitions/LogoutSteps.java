package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
@SuppressWarnings("unused")
public class LogoutSteps {

    private boolean isLoggedIn = false;
    private boolean logoutClicked = false;
    private String currentPage = "";
    private String message = "";

    @Given("the user is logged into the application")
    public void user_is_logged_into_the_application() {
        // Simulate that the user is already logged in
        isLoggedIn = true;
        currentPage = "homepage";
        System.out.println("User successfully logged in and on homepage.");
    }

    @When("the user clicks the logout button")
    public void user_clicks_the_logout_button() {
        // Simulate logout action
        if (isLoggedIn && currentPage.equals("homepage")) {
            logoutClicked = true;
            isLoggedIn = false;
            currentPage = "loginpage";
            message = "You have been successfully logged out.";
            System.out.println("Logout button clicked.");
        } else {
            message = "Logout failed — user not logged in.";
            System.out.println("Logout failed — user not logged in.");
        }
    }

    @Then("the user should be redirected to the login page")
    public void user_redirected_to_login_page() {
        // Validate redirect
        assertEquals("loginpage", currentPage);
        System.out.println("User redirected to login page.");
    }

    @Then("a logout confirmation message should be displayed")
    public void logout_confirmation_message_displayed() {
        // Validate confirmation message
        assertEquals("You have been successfully logged out.", message);
        System.out.println("Logout confirmation message displayed.");
    }
}
