package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = {"pretty", "html:TestResults/Template/TemplateResults", "json:target/TemplateResults.json"},
        glue = {"stepdefs"},
        features = {"classpath:features"}
)

public class RunComponent {

    @BeforeClass
    public static void setUp() {

        //load configuration

    }

    @AfterClass
    public static void aa() {

    }
}