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

    public static final Target INPUT_QUERY =Target.the("Write the query").located
            (By.id("input-query"));
    public static final Target INPUT_KEYWORD =Target.the("Write the keyword").located
            (By.id("input-keyword"));

    public static final Target CLICK_STORE =Target.the("Click Store").located
            (By.id("input-store"));
    public static final Target CLICK_LANGUAJE =Target.the("Click Languaje").located
            (By.id("input-language"));

    public static final Target BUTTON_FILTER =Target.the("Click boton Filter").located
            (By.id("button-filter"));

    public static final Target SEOURL_LIST =Target.the("Click on showing pages").located
            (By.xpath("//div[text()= 'SEO URL List']"));
}
