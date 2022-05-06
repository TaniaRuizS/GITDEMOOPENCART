package co.com.choucair.certification.opencart.stepdefinitions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.questions.AnswerEmptyField;
import co.com.choucair.certification.opencart.tasks.EditEmptyField;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CP3StepDefinitions {
    @When("^She enters the data she wants to edit leaving a mandatory field empty$")
    public void sheEntersTheDataSheWantsToEditLeavingAMndatoryFieldEmpty(List<DataFilterBD> dataFilterBD)  {
        OnStage.theActorInTheSpotlight().attemptsTo(EditEmptyField.the(dataFilterBD.get(0)));
    }
    @Then("^displays an alert message about the characters$")
    public void displaysAnAlertMessageAboutTheCharacters(List<DataFilterBD> dataFilterBD) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEmptyField.empty(dataFilterBD.get(0))));
    }


}
