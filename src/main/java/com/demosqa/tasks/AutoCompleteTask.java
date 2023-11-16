package com.demosqa.tasks;

import com.demosqa.userinterfaces.AutoCompleteUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class AutoCompleteTask implements Task {
    private String color1;
    private String color2;
    private String color3;

    public AutoCompleteTask(String color1) {
        this.color1 = color1;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AutoCompleteUser.TXT_MULTIPLE_COLOR, WebElementStateMatchers.isEnabled())
                        .forNoMoreThan(10).seconds().then(Click.on(AutoCompleteUser.TXT_MULTIPLE_COLOR)),
                Enter.theValue(color1).into(AutoCompleteUser.TXT_SELECT_MULTIPLE_COLOR).thenHit(Keys.ENTER),
                Enter.theValue(color2).into(AutoCompleteUser.TXT_SELECT_MULTIPLE_COLOR).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Scroll.to(AutoCompleteUser.TXT_SINGLE_COLOR),
                Click.on(AutoCompleteUser.TXT_SINGLE_COLOR),
                Enter.theValue(color3).into(AutoCompleteUser.TXT_SELECT_SINGLE_COLOR).thenHit(Keys.ENTER)
        );
    }

    public static AutoCompleteTask withInfo(String color1) {
        return Tasks.instrumented(AutoCompleteTask.class, color1);
    }

    public AutoCompleteTask withColor2(String color2) {
        this.color2 = color2;
        return this;
    }

    public AutoCompleteTask withColor3(String color3) {
        this.color3 = color3;
        return this;
    }
}
