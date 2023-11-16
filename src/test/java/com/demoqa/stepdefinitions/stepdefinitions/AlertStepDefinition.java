package com.demoqa.stepdefinitions.stepdefinitions;

import com.demosqa.questions.AlertsQuestion;
import com.demosqa.questions.AutoCompleteQuestion;
import com.demosqa.tasks.AlertsTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.TheValue;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AlertStepDefinition {

    @When("tour in alerts")
    public void tourInAlerts(DataTable dataTable) {
        List<String> info = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(AlertsTask.withInfo(info.get(0)));
    }

    @Then("validates alerts {string}")
    public void validatesAlerts (String result) {
        Boolean resultTest = OnStage.theActorInTheSpotlight()
                .asksFor(AlertsQuestion.withResult(result));

        OnStage.theActorInTheSpotlight().should(seeThat("validación resultado esperado",
                TheValue.of(resultTest).asBoolean(), equalTo(true)));
    }
}
