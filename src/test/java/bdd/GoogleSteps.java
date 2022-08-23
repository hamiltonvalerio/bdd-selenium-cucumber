package bdd;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.context.annotation.Lazy;
import org.testng.Assert;

import br.eti.valerio.page.google.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest
public class GoogleSteps {

    @Lazy
    @Autowired
	private GooglePage googlePage;

    /*@Before
    public void beforeScenario(){
        this.googlePage.goTo();
    }*/

	@Given("Eu estiver no site do google")
    public void eu_estiver_no_site_do_google(){
        this.googlePage.goTo();
    }

    @When("Eu escrevo {string} no textbox")
    public void eu_escrevo_something_no_textbox(String keyword){
    	this.googlePage.getSearchComponent().search(keyword);
    }

    @Then("Eu devo ver os resultados da busca")
    public void eu_clico_no_boto_search() {
    	Assert.assertTrue(this.googlePage.getSearchResult().isAt());
    }

    @Then("Eu espero pelo menos {int} resultados")
    public void eu_espero_pelo_menos_something_resultados(int count) {
    	Assert.assertTrue(this.googlePage.getSearchResult().getCount() >= count);
    }

    /*@After()
    public void closeBrowser() {
        googlePage.quit();
    }*/
}
