package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterEditData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.targets.Target;

public class FilterEdit implements Task {
    public DataFilterBD dataFilterBD = new DataFilterBD();

    public FilterEdit (DataFilterBD dataFilterBD){
        this.dataFilterBD = dataFilterBD;}

    public static FilterEdit the(DataFilterBD dataFilterBD) {
        return Tasks.instrumented(FilterEdit.class,dataFilterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataFilterBD.getUsername()).into(FilterEditData.USER_NAME));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getPassword()).into(FilterEditData.PASSWORD));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_LOGIN));
        actor.attemptsTo(Click.on(FilterEditData.CLICK_DESING));
        selectSeoUrl(actor);
        actor.attemptsTo(Enter.theValue(dataFilterBD.getQuery()).into(FilterEditData.INPUT_QUERY));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getKeyword()).into(FilterEditData.INPUT_KEYWORD));
        actor.attemptsTo(Click.on(FilterEditData.CLICK_STORE));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.CLICK_STORE));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.CLICK_STORE));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(FilterEditData.CLICK_STORE));
        actor.attemptsTo(Click.on(FilterEditData.CLICK_LANGUAJE));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.CLICK_LANGUAJE));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FilterEditData.CLICK_LANGUAJE));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(FilterEditData.CLICK_LANGUAJE));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_FILTER));
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

