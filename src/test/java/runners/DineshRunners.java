package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags = "@dn25", features = "src/test/java/features/Main.feature", glue = {
		"classpath:stepdefinitions"}, plugin = {"pretty"})

public class DineshRunners {


}
