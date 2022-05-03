package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class Filter implements Task {

    public DataFilterBD dataFilterBD = new DataFilterBD();

    public Filter(DataFilterBD dataFilterBD){ this.dataFilterBD= dataFilterBD;}

    public static Filter the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(Filter.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataFilterBD.getUsername()).into(FilterData.USER_NAME));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getPassword()).into(FilterData.PASSWORD));
        actor.attemptsTo(Click.on(FilterData.BUTTON_LOGIN));
        actor.attemptsTo(Click.on(FilterData.CLICK_DESING));
        selectSeoUrl(actor);

    }

    public void selectSeoUrl(Actor actor) {

            String seoUrl = dataFilterBD.getSeourl();
            String xpath = "//a[contains(text(),'%s')]";
            Target select_seoUrl = Target.the("Select SEO URL").
                    located(By.xpath(String.format(xpath, seoUrl)));
            actor.attemptsTo(Click.on(select_seoUrl));

    }
}
