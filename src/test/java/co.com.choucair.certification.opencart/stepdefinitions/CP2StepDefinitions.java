package co.com.choucair.certification.opencart.stepdefinitions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.questions.AnswerEdit;
import co.com.choucair.certification.opencart.tasks.FilterEdit;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CP2StepDefinitions {
    @When("^She enters the data she wants to edit$")
    public void sheEntersTheDataSheWantsToEdit(List<DataFilterBD> dataFilterBD)  {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterEdit.the(dataFilterBD.get(0)));
    }

    @Then("^She displays a warning message$")
    public void sheDisplaysAWarningMessage(List<DataFilterBD> dataFilterBD) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEdit.edit(dataFilterBD.get(0))));
    }

}
