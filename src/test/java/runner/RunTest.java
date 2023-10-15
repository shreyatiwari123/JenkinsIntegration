package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "classpath:features/Login.feature",
        glue = "stepdefs",
        tags = "@Open_New_Account",
        plugin = {"pretty",
                "html:target/cucumber-report.html"

        },
        dryRun = true


)
public class RunTest extends AbstractTestNGCucumberTests {
}
