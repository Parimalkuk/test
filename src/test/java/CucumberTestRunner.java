import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = { "pretty", "html:target/cucumber-html-reports.html"},
        monochrome = true
        //tags
)
public class CucumberTestRunner{
}
