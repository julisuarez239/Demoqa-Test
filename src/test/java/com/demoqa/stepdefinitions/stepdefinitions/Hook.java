package com.demoqa.stepdefinitions.stepdefinitions;

import com.demosqa.tasks.DemoPageTask;
import com.demosqa.utils.Constants;
import com.demosqa.utils.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Hook {
    @Before
    public void inicializeActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
    }
    @Given("user open application")
    public void userOpenApplication() {
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.chrome().onUrl(Constants.URL_APP)));
        OnStage.theActorInTheSpotlight().attemptsTo((Open.url(Constants.URL_APP)));
    }
    @Given("select option")
    public void selectOption(DataTable dataTable) {
        List<String> info = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(DemoPageTask.withInformation(info.get(0))
                .withSubmenu(info.get(1)));
    }
}
