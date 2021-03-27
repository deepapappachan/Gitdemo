package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page()
    {
        System.out.println("Landing page");
    }

    @When("^User login to application with username and password$")
    public void user_is_on_netbankingg_landing_page()
    {
        System.out.println("username and password");
    }

    @Then("^Home page is populated$")
    public void user_is_on_netbankinggg_landing_page()
    {
        System.out.println("Home page");
    }

    @And("^Cards are displayed$")
    public void user_is_on_netbankingggg_landing_page()
    {
        System.out.println("Cards displayed");
    }

    @When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_to_application_with_and(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        System.out.println(arg1);
    }
}
