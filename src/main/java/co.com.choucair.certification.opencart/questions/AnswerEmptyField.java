package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.model.DataFilterBD;
import co.com.choucair.certification.opencart.userinterface.EditEmptyFieldData;
import co.com.choucair.certification.opencart.userinterface.FilterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerEmptyField implements Question<Boolean> {
    private DataFilterBD dataFilterBD;

    public AnswerEmptyField(DataFilterBD dataFilterBD) {
        this.dataFilterBD = dataFilterBD;
    }

    public static AnswerEmptyField empty(DataFilterBD dataFilterBD) {
        return new AnswerEmptyField(dataFilterBD);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String characters= Text.of(EditEmptyFieldData.CHARACTERS).viewedBy(actor).asString();
        if (dataFilterBD.getCharacters().equals(characters)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
