package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.EditEmptyFieldData;
import co.com.choucair.certification.opencart.userinterface.FilterEditData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditEmptyField implements Task {
    public DataFilterBD dataFilterBD = new DataFilterBD();

    public EditEmptyField(DataFilterBD dataFilterBD){this.dataFilterBD=dataFilterBD;}

    public static EditEmptyField the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(EditEmptyField.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataFilterBD.getUsername()).into(EditEmptyFieldData.USER_NAME));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getPassword()).into(EditEmptyFieldData.PASSWORD));
        actor.attemptsTo(Click.on(EditEmptyFieldData.BUTTON_LOGIN));
        actor.attemptsTo(Click.on(EditEmptyFieldData.CLICK_DESING));
        selectSeoUrl(actor);
        actor.attemptsTo(Click.on(FilterEditData.SELECT_CHECKBOX));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_EDIT));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getQueryedit()).into(FilterEditData.QUERY_EDIT));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getKeywordedit()).into(FilterEditData.KEYWORD_EDIT));
        actor.attemptsTo(Click.on(FilterEditData.SELECT_STORE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.SELECT_STORE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(FilterEditData.SELECT_STORE_EDIT));
        actor.attemptsTo(Click.on(FilterEditData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(FilterEditData.SELECT_LANGUAJE_EDIT));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_SAVE));

    }

    public void selectSeoUrl(Actor actor) {
        String seoUrl = dataFilterBD.getSeourl();
        String xpath = "//a[contains(text(),'%s')]";
        Target select_seoUrl = Target.the("Select SEO URL").
                located(By.xpath(String.format(xpath, seoUrl)));
        actor.attemptsTo(Click.on(select_seoUrl));
    }
}
