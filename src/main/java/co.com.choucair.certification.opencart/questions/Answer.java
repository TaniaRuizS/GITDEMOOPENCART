package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question <Boolean> {

    private DataFilterBD dataFilterBD;

    public Answer(DataFilterBD dataFilterBD) {
        this.dataFilterBD = dataFilterBD;
    }


    public static Answer filter(DataFilterBD dataFilterBD) {
        return new Answer(dataFilterBD);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String seourl= Text.of(FilterData.SEOURL_LIST).viewedBy(actor).asString();
        if (dataFilterBD.getSeourllist().equals(seourl)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
