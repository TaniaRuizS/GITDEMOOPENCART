package co.com.choucair.certification.opencart.util;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Utilities {

    private DataFilterBD dataFilterBD;

    public Utilities(DataFilterBD dataFilterBD) {
        this.dataFilterBD = dataFilterBD;
    }

    public void selectSeoUrl(Actor actor) {
        String seoUrl = dataFilterBD.getSeourl();
        String xpath = "//a[contains(text(),'%s')]";
        Target select_seoUrl = Target.the("Select SEO URL").
                located(By.xpath(String.format(xpath, seoUrl)));
        actor.attemptsTo(Click.on(select_seoUrl));}

    public void selectStore(Actor actor) {
        String store = dataFilterBD.getStore();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_store = Target.the("Select Store").
                located(By.xpath(String.format(xpath, store)));
        actor.attemptsTo(Click.on(select_store));}

    public void selectStoreEdit(Actor actor) {
        String storeedit = dataFilterBD.getStoreedit();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_storeedit = Target.the("Select Store Edit").
                located(By.xpath(String.format(xpath, storeedit)));
        actor.attemptsTo(Click.on(select_storeedit));}

    public void selectLanguaje(Actor actor) {
        String store = dataFilterBD.getLanguage();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_languaje = Target.the("Select Languaje").
                located(By.xpath(String.format(xpath, store)));
        actor.attemptsTo(Click.on(select_languaje));}

    public void selectLanguajeEdit(Actor actor) {
        String languajeedit = dataFilterBD.getLanguajeedit();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_languajeedit = Target.the("Select Languaje edit").
                located(By.xpath(String.format(xpath, languajeedit)));
        actor.attemptsTo(Click.on(select_languajeedit));}
}
