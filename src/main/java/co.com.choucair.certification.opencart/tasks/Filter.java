package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Filter implements Task {

    public DataFilterBD dataFilterBD = new DataFilterBD();

    public Filter(DataFilterBD dataFilterBD){ this.dataFilterBD= dataFilterBD;}

    public static Filter the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(Filter.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FilterData.BUTTON_LOGIN));
    }
}
