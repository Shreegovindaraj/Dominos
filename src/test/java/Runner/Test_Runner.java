package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Feature\\Example.feature",  // Path to feature files
        glue = {"Step","Hooks"},  // Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports.html"},  // Generates an HTML report
        tags = "@SmokeTest"
)
public class Test_Runner {

}
