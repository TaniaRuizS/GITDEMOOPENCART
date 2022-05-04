package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import co.com.choucair.certification.opencart.userinterface.FilterEditData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerEdit implements Question<Boolean> {

    private DataFilterBD dataFilterBD;

    public AnswerEdit(DataFilterBD dataFilterBD){ this.dataFilterBD = dataFilterBD;}

    public static AnswerEdit edit(DataFilterBD dataFilterBD) {
        return new AnswerEdit(dataFilterBD);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String warning= Text.of(FilterEditData.WARNING).viewedBy(actor).asString();
        if (dataFilterBD.getWarning().equals(warning)) {
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
