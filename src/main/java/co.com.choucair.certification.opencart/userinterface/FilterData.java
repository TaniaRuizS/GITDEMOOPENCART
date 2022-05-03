package co.com.choucair.certification.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterData extends PageObject {

    public static final Target USER_NAME =Target.the("enter username").located
            (By.id("input-username"));
    public static final Target PASSWORD =Target.the("enter password").located
            (By.id("input-password"));

    public static final Target BUTTON_LOGIN =Target.the("Click on the login button").located
            (By.xpath("//button[@class= 'btn btn-primary']"));
    public static final Target CLICK_DESING =Target.the("Click on Desing").located
            (By.id("menu-design"));
    //public static final Target CLICK_DESING =Target.the("Click on Desing").located
            //(By.id("menu-design"));
}
