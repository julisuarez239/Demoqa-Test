package com.demoqa.stepdefinitions.stepdefinitions;

import com.demosqa.questions.AutoCompleteQuestion;
import com.demosqa.tasks.AutoCompleteTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.TheValue;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AutoCompleteStepDefinition {

    @When("complete form")
    public void completeForm(DataTable dataTable) {
        List<String> info = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(AutoCompleteTask.withInfo(info.get(0))
                .withColor2(info.get(1))
                .withColor3(info.get(1)));
    }

    @Then("validates that the text is reflected {string}")
    public void validatesThatTheTextIsReflected(String result) {
        Boolean resultTest = OnStage.theActorInTheSpotlight()
                .asksFor(AutoCompleteQuestion.withResult(result));

        OnStage.theActorInTheSpotlight().should(seeThat("validación resultado esperado",
                TheValue.of(resultTest).asBoolean(), equalTo(true)));

    }

}
