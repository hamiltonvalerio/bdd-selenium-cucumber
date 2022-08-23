package bdd;

import br.eti.valerio.page.google.GooglePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class CucumberHooks {

    @Lazy
    @Autowired
    private GooglePage googlePage;

    @Before
    public void beforeScenario(){
        this.googlePage.goTo();
    }

    /*@After
    public void afterScenario(){
        this.googlePage.isAt();
    }*/
}
