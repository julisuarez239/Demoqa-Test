package com.demoqa.stepdefinitions.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.demoqa\\autocomplete.feature",
        glue = "com.demoqa.stepdefinitions.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AutoCompleteRunner {
}
