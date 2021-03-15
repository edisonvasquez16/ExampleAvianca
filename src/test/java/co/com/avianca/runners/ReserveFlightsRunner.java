package co.com.avianca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/SelectFlights.feature",
        glue = "co.com.avianca",
        snippets = SnippetType.CAMELCASE
)
public class ReserveFlightsRunner {

}
