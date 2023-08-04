package co.com.devco.certification.pg.stepdefinitions;

import co.com.devco.certification.pg.questions.Validation;
import co.com.devco.certification.pg.tasks.ValidateDocument;
import co.com.devco.certification.pg.utils.Chrome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;


public class PruebaXStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
    }

    @Given("^that the user is in the web$")
    public void thatTheUserIsInTheWeb() {
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(Chrome.in().pruebaX()));
    }

    @When("^The user enter in the page to see the documnent$")
    public void theUserEnterInThePageToSeeTheDocumnent() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateDocument.enter());
    }

    @Then("^The user see the correct PDF$")
    public void theUserSeeTheCorrectPDF() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validation.ok()));
    }


}
