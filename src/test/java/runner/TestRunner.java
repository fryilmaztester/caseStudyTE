package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/json-reports/cucumber.json"
        },

        features = "./src/test/resources/features",
        glue = "stepdefinitons",
        tags = "@iPaintApp",
        dryRun = false
)
public class TestRunner {


}
