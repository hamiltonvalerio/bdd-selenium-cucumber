package bdd;

import br.eti.valerio.BddSeleniumCucumberApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = BddSeleniumCucumberApplication.class)
public class CucumberSpringConfig {
}
