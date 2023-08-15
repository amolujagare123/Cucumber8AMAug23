package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "Features"
        , glue = "stepdefinitions"
,tags = " @AddClientParam" //, dryRun = true
        , plugin = {"pretty","html:target/cucumber.html"}
)
public class TestRunner {
}
