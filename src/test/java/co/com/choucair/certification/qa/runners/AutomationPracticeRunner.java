package co.com.choucair.certification.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/demoAutomationPractice.feature",
        glue = {"co.com.choucair.certification.qa.stepdefinitions"},
        tags = "@CrearUserExitoso",
        snippets = SnippetType.CAMELCASE
)

public class AutomationPracticeRunner {

}
