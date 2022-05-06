package co.com.choucair.certification.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditEmptyFieldData extends PageObject {

    public static final Target SELECT_STORE_EDIT =Target.the("Select the Store edit").located
            (By.name("store_id"));
    public static final Target SELECT_LANGUAJE_EDIT =Target.the("Select the Languaje edit").located
            (By.name("language_id"));
    //RESPUESTA CP 003
    public static final Target CHARACTERS =Target.the("see alert message of the characters").located
            (By.xpath("//div[contains(text(), 'characters')]"));
}
