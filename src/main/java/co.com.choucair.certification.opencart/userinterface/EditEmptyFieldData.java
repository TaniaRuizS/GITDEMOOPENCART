package co.com.choucair.certification.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditEmptyFieldData extends PageObject {

    public static final Target USER_NAME = Target.the("enter username").located
            (By.id("input-username"));
    public static final Target PASSWORD = Target.the("enter password").located
            (By.id("input-password"));
    public static final Target BUTTON_LOGIN = Target.the("Click on the login button").located
            (By.xpath("//button[@class= 'btn btn-primary']"));
    public static final Target CLICK_DESING = Target.the("Click on Desing").located
            (By.id("menu-design"));
    public static final Target SELECT_CHECKBOX =Target.the("Click boton edit").located
            (By.name("selected[]"));
    public static final Target BUTTON_EDIT =Target.the("Click boton edit").located
            (By.xpath("//i[@class= 'fa fa-plus']"));
    public static final Target QUERY_EDIT =Target.the("Write the query edit").located
            (By.name("query"));
    public static final Target KEYWORD_EDIT =Target.the("Write the keyword edit").located
            (By.name("keyword"));
    public static final Target SELECT_STORE_EDIT =Target.the("Select the Store edit").located
            (By.name("store_id"));
    public static final Target SELECT_LANGUAJE_EDIT =Target.the("Select the Languaje edit").located
            (By.name("language_id"));
    public static final Target BUTTON_SAVE =Target.the("Click boton Save").located
            (By.xpath("//button[@class= 'btn btn-primary']"));
}
