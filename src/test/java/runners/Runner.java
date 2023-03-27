package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/youtube.feature",
        glue = "stepDefinitions",
        tags="@CP_004",
        snippets = SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class Runner {
}
