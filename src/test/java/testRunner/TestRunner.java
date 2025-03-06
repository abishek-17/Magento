package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/features",
        glue = "stepDefinition",
        plugin = {"pretty", "json:target/cucumber.json", "message:target/cucumber.ndjson"},
        monochrome = true
)

public class TestRunner {

}
