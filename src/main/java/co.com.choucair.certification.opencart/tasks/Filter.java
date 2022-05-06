package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import co.com.choucair.certification.opencart.util.Utilities;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Filter implements Task {

    private DataFilterBD dataFilterBD;
    public Utilities utilities;

    public Filter(DataFilterBD dataFilterBD) {
        this.dataFilterBD = dataFilterBD;
        utilities = new Utilities(dataFilterBD);
    }

    public static Filter the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(Filter.class, dataFilterBD);
    }

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
        actor.attemptsTo(Click.on(FilterData.BUTTON_FILTER));
    }
}
