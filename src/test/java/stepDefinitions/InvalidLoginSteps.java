package stepDefinitions;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class InvalidLoginSteps {

    private String username;
    private String password;
    private String message;

    @When("the user enters username {string} and password {string}")
    public void user_enters_invalid_credentials(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Entered: " + username + " / " + password);
    }

    @Then("an error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedMessage) {
        // Mock validation logic
        if ("wrongUser".equals(username) || "wrongPass".equals(password))
            message = "Invalid username or password";
        else if ("blankUser".equals(username) || "blankPass".equals(password))
            message = "Please enter credentials";
        else
            message = "Unknown error";

        System.out.println("Displayed message: " + message);
        assertEquals(expectedMessage, message);
    }
}
