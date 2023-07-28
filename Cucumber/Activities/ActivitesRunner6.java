import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class ActivitesRunner6 {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@SimpleAlert",
            plugin = {"pretty"},
            monochrome = true
    )

    public class ActivitiesRunner {
        //This is intentionally blank
    }
}
