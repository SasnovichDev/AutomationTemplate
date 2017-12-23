package stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefsCommon {

    @Given("^\"([^\"]*)\" is running$")
    public void is_running(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
    }

    @When("^I send a \"([^\"]*)\"$")
    public void I_send_a(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
    }

    @Then("^I expect \"([^\"]*)\"$")
    public void I_expect(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
    }
}