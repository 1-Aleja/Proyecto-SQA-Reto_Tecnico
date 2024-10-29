package co.com.retoaleja.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_product.feature",
glue = "co.com.retoaleja.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RegisterProduct {
}
