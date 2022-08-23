package br.eti.valerio;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "bdd",
        plugin = {
                "pretty",
                "html:target/cucumber"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
