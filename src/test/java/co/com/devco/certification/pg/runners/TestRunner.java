package co.com.devco.certification.pg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\ejemplo.feature",
        glue = "co.com.devco.certification.pg.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class TestRunner {

}
 