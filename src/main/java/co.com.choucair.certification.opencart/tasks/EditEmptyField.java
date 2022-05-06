package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.EditEmptyFieldData;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import co.com.choucair.certification.opencart.userinterface.FilterEditData;
import co.com.choucair.certification.opencart.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class EditEmptyField implements Task {
    private DataFilterBD dataFilterBD;
    private Utilities utilities;

    public EditEmptyField(DataFilterBD dataFilterBD){this.dataFilterBD=dataFilterBD; utilities = new Utilities(dataFilterBD);}

    public static EditEmptyField the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(EditEmptyField.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataFilterBD.getUsername()).into(FilterData.USER_NAME),
                Enter.theValue(dataFilterBD.getPassword()).into(FilterData.PASSWORD),
                Click.on(FilterData.BUTTON_LOGIN),
                Click.on(FilterData.CLICK_DESING));

        utilities.selectSeoUrl(actor);

        actor.attemptsTo(
                Click.on(FilterEditData.SELECT_CHECKBOX),
                Click.on(FilterEditData.BUTTON_EDIT),
                Enter.theValue(dataFilterBD.getQueryedit()).into(FilterEditData.QUERY_EDIT),
                Enter.theValue(dataFilterBD.getKeywordedit()).into(FilterEditData.KEYWORD_EDIT));

        actor.attemptsTo(Click.on(EditEmptyFieldData.SELECT_STORE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(EditEmptyFieldData.SELECT_STORE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(EditEmptyFieldData.SELECT_STORE_EDIT));
        actor.attemptsTo(Click.on(EditEmptyFieldData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(EditEmptyFieldData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(EditEmptyFieldData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_SAVE));

    }
}
