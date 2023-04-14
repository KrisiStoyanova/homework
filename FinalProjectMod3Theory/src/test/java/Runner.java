import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = "src/test/resources/features",
        tags = {"@viewport"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true)

public class Runner {
}
