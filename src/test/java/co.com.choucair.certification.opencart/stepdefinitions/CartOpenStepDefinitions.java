package co.com.choucair.certification.opencart.stepdefinitions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.questions.AnswerFilter;
import co.com.choucair.certification.opencart.tasks.Filter;
import co.com.choucair.certification.opencart.tasks.FilterEdit;
import co.com.choucair.certification.opencart.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CartOpenStepDefinitions {

@Before
public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("^Tania wants to filter data in the SEO URL list$")
    public void taniaWantsToFilterDataInTheSEOURLList() {
        OnStage.theActorCalled("Tania Ruiz Sanchez").wasAbleTo(OpenUp.thePage());
    }

    @Given("^Tania wants to edit data from the list consulted in SEO URL$")
    public void taniaWantsToEditDataFromTheListConsultedInSEOURL() {
        OnStage.theActorCalled("Tania Ruiz Sanchez").wasAbleTo(OpenUp.thePage());
    }


    @When("^She enter the data in the filter field$")
    public void sheEnterTheDataInTheFilterField(List<DataFilterBD> dataFilterBD)  {
    OnStage.theActorInTheSpotlight().attemptsTo(Filter.the(dataFilterBD.get(0)));
    }

    @When("^She enters the data she wants to edit$")
    public void sheEntersTheDataSheWantsToEdit(List<DataFilterBD> dataFilterBD)  {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterEdit.the(dataFilterBD.get(0)));
    }

    @Then("^She visualizes the information in SEO URL List$")
    public void SheVisualizesTheInformationInSEOURLList(List<DataFilterBD> dataFilterBD) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerFilter.filter(dataFilterBD.get(0))));
    }

    @Then("^She displays a warning message$")
    public void sheDisplaysAWarningMessage() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEdit.edit(dataFilterBD.get(0))));
    }

}
