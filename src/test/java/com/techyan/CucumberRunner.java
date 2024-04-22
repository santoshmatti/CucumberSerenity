package com.techyan;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features",
        glue = {"classpath:com.techyan.stepdefs"},
        tags="@demotest",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberRunner {
}
