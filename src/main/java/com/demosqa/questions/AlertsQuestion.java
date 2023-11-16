package com.demosqa.questions;

import com.demosqa.userinterfaces.AlertsUser;
import com.demosqa.userinterfaces.AutoCompleteUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TheValue;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class AlertsQuestion implements Question<Boolean> {
    private final String result;

    public AlertsQuestion(String result) {
        this.result = result;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThat("Validate result",
                TheValue.of(Text.of(AlertsUser.TXT_ALERT_PROMPT)
                        .answeredBy(actor)).asString(), containsString(result)));
        return true;
    }

    public static AlertsQuestion withResult(String result) {
        return new AlertsQuestion(result);
    }
}

