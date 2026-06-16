package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features/Filters.feature",
        glue = {"StepDefinitions", "hooks"},
        plugin = {
                "pretty",
                "html:Reports/myReport.html"
        }
)



public class TestRunner extends AbstractTestNGCucumberTests {
}
