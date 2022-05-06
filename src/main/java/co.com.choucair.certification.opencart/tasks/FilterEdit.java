package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import co.com.choucair.certification.opencart.userinterface.FilterEditData;
import co.com.choucair.certification.opencart.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class FilterEdit implements Task {
    private DataFilterBD dataFilterBD;
    private Utilities utilities;

    public FilterEdit (DataFilterBD dataFilterBD){
        this.dataFilterBD = dataFilterBD;
        utilities = new Utilities(dataFilterBD);
    }

    public static FilterEdit the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(FilterEdit.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataFilterBD.getUsername()).into(FilterData.USER_NAME),
                Enter.theValue(dataFilterBD.getPassword()).into(FilterData.PASSWORD),
                Click.on(FilterData.BUTTON_LOGIN),
                Click.on(FilterData.CLICK_DESING));

        utilities.selectSeoUrl(actor);

        actor.attemptsTo(
                Enter.theValue(dataFilterBD.getQuery()).into(FilterData.INPUT_QUERY),
                Enter.theValue(dataFilterBD.getKeyword()).into(FilterData.INPUT_KEYWORD));

        utilities.selectStore(actor);
        utilities.selectLanguaje(actor);

        actor.attemptsTo(
                Click.on(FilterData.BUTTON_FILTER),
                Click.on(FilterEditData.SELECT_CHECKBOX),
                Click.on(FilterEditData.BUTTON_EDIT),
                Enter.theValue(dataFilterBD.getQueryedit()).into(FilterEditData.QUERY_EDIT),
                Enter.theValue(dataFilterBD.getKeywordedit()).into(FilterEditData.KEYWORD_EDIT));

        utilities.selectStoreEdit(actor);
        utilities.selectLanguajeEdit(actor);
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_SAVE));
    }
}

