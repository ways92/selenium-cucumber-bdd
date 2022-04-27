package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"stepDefinitions"},
        plugin = {"html:test_output/HTML_report/HtmlReports.html"}
)

public class RunPage extends AbstractTestNGCucumberTests{
}