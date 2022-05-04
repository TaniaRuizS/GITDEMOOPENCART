package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.userinterface.FilterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;}

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
    boolean result;
    String seoUrlList = Text.of(FilterData.SEOURL_LIST).viewedBy(actor).asString();
        if (seoUrlList.contains(question)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
