package ProjectMod3.POM;

import ProjectMod3.Helpers.BeforeAfter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        tags = {"@desktop", "@mobile", "@tablet"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)


public class Runner {
}
