package br.eti.valerio;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "bdd",
        plugin = {
                "pretty",
                "html:target/cucumber/"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
