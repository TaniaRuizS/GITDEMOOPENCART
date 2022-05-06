package co.com.choucair.certification.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterEditData extends PageObject {
    //CP002
    public static final Target SELECT_CHECKBOX =Target.the("Click boton edit").located
            (By.name("selected[]"));
    public static final Target BUTTON_EDIT =Target.the("Click boton edit").located
            (By.xpath("//i[@class= 'fa fa-pencil']"));
    public static final Target QUERY_EDIT =Target.the("Write the query edit").located
            (By.name("query"));
    public static final Target KEYWORD_EDIT =Target.the("Write the keyword edit").located
            (By.name("keyword"));
    public static final Target BUTTON_SAVE =Target.the("Click boton Save").located
            (By.xpath("//button[@class= 'btn btn-primary']"));
    //RESPUESTA CP 002
    public static final Target WARNING =Target.the("see alert message").located
            (By.xpath("//div[contains(text(), 'Warning')]"));
}
