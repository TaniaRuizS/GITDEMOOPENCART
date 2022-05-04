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
        selectStore(actor);
        selectLanguaje(actor);
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_FILTER));
        actor.attemptsTo(Click.on(FilterEditData.SELECT_CHECKBOX));
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_EDIT));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getQueryedit()).into(FilterEditData.QUERY_EDIT));
        actor.attemptsTo(Enter.theValue(dataFilterBD.getKeywordedit()).into(FilterEditData.KEYWORD_EDIT));
        selectStoreEdit(actor);
        selectLanguajeEdit(actor);
        actor.attemptsTo(Click.on(FilterEditData.BUTTON_SAVE));
    }
    public void selectSeoUrl(Actor actor) {
        String seoUrl = dataFilterBD.getSeourl();
        String xpath = "//a[contains(text(),'%s')]";
        Target select_seoUrl = Target.the("Select SEO URL").
                located(By.xpath(String.format(xpath, seoUrl)));
        actor.attemptsTo(Click.on(select_seoUrl));
    }
    public void selectStore(Actor actor) {
        String store = dataFilterBD.getStore();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_store = Target.the("Select Store").
                located(By.xpath(String.format(xpath, store)));
        actor.attemptsTo(Click.on(select_store));
    }
    public void selectStoreEdit(Actor actor) {
        String storeedit = dataFilterBD.getStoreedit();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_storeedit = Target.the("Select Store Edit").
                located(By.xpath(String.format(xpath, storeedit)));
        actor.attemptsTo(Click.on(select_storeedit));
    }


    public void selectLanguaje(Actor actor) {
        String languaje = dataFilterBD.getLanguage();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_languaje = Target.the("Select Languaje").
                located(By.xpath(String.format(xpath, languaje)));
        actor.attemptsTo(Click.on(select_languaje));
    }

    public void selectLanguajeEdit(Actor actor) {
        String languajeedit = dataFilterBD.getLanguajeedit();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_languajeedit = Target.the("Select Languaje edit").
                located(By.xpath(String.format(xpath, languajeedit)));
        actor.attemptsTo(Click.on(select_languajeedit));
    }

}

