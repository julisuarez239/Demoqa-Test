package com.demosqa.tasks;

import com.demosqa.userinterfaces.DemoPageUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DemoPageTask implements Task {

    private final String valueOption;
    private String subMenu;

    public DemoPageTask(String valueOption) {

        this.valueOption = valueOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoPageUser.LBL_IMAGE),
                WaitUntil.the(DemoPageUser.LBl_OPTIONS.of(valueOption), WebElementStateMatchers.isEnabled())
                        .forNoMoreThan(5).seconds().then(Scroll.to(DemoPageUser.LBl_OPTIONS.of(valueOption))),
                Click.on(DemoPageUser.LBl_OPTIONS.of(valueOption)),
                Scroll.to(DemoPageUser.LBL_OPTION_ACCORDION.of(valueOption)),
                Click.on(DemoPageUser.LBl_SUB_MENU.of(subMenu))
        );
    }

    public static DemoPageTask withInformation(String valueOption) {
        return Tasks.instrumented(DemoPageTask.class,valueOption);
    }
    public DemoPageTask withSubmenu(String subMenu) {
        this.subMenu = subMenu;
        return this;
    }
}
