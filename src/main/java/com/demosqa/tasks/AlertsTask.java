package com.demosqa.tasks;

import com.demosqa.interactions.WaitMoment;
import com.demosqa.userinterfaces.AlertsUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AlertsTask implements Task {

    private String text;

    public AlertsTask(String text) {

        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsUser.BTN_SEE_ALERT));
        getDriver().switchTo().alert().accept();
        actor.attemptsTo(
                Click.on(AlertsUser.BTN_ALERT_5_S),
                WaitMoment.pageInSeconds(5));
        getDriver().switchTo().alert().accept();
        actor.attemptsTo(
                Scroll.to(AlertsUser.BTN_ALERT_5_S),
                Click.on(AlertsUser.BTN_ALERT_CONFIRM));
        getDriver().switchTo().alert().dismiss();
        actor.attemptsTo(
                Click.on(AlertsUser.BTN_ALERT_PROMPT));
        getDriver().switchTo().alert().sendKeys(text);
        getDriver().switchTo().alert().accept();
    }

    public static AlertsTask withInfo(String text) {
        return Tasks.instrumented(AlertsTask.class, text);
    }
}
