package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("i_navigate_to_the_login_page");
    }
    @When("I enter the username as {string} and password as {string}")
    public void i_enter_the_username_as_and_password_as(String string, String string2) {
        System.out.println("i_enter_the_username_as_and_password_as");
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println(" i_click_on_the_login_button");
    }
    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        System.out.println("i_should_see_the_userform_page");
    }

    @But("It should display error message")
    public void itShouldDisplayErrorMessage() {
        System.out.println("itShouldDisplayErrorMessage");
    }
}
