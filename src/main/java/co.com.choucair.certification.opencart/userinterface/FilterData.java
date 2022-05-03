package co.com.choucair.certification.opencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterData extends PageObject {

    public static final Target BUTTON_LOGIN =Target.the("Click on the login button").located
            (By.xpath("//button[@class= 'btn btn-primary']"));
}
