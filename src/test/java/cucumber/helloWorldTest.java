package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class helloWorldTest {

    @Given("I have correct project")
    public void i_have_correct_project() {
        System.out.println("projektet startar");
    }

    @When("I write Hello World Cucumber test")
    public void i_write_Hello_World_Cucumber_test() {
        System.out.println("detta är ett test");
    }

    @Then("I should be able to run it an see {string} printed on screen.")
    public void i_should_be_able_to_run_it_an_see_printed_on_screen(String string) {
        System.out.println("Hello World");
    }

}
