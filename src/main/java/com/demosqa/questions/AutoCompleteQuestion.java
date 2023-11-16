package com.demosqa.questions;

import com.demosqa.userinterfaces.AutoCompleteUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TheValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class AutoCompleteQuestion implements Question<Boolean> {

    private final String result;

    public AutoCompleteQuestion(String result) {
        this.result = result;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat("Validate result",
                TheValue.of(Text.of(AutoCompleteUser.TXT_SINGLE_COLOR)
                        .answeredBy(actor)).asString(), containsString(result)));
        return true;
    }

    public static AutoCompleteQuestion withResult(String result) {
        return new AutoCompleteQuestion(result);
    }
}
