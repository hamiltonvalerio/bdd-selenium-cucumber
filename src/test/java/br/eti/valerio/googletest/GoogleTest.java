package br.eti.valerio.googletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import br.eti.valerio.SpringBaseTestNGTest;
import br.eti.valerio.page.google.GooglePage;

public class GoogleTest extends SpringBaseTestNGTest{

	@Lazy
	@Autowired
	private GooglePage googlePage;
	
	@Test
	public void googleTest() {
		this.googlePage.goTo();
		Assert.assertTrue(this.googlePage.isAt());
		
		this.googlePage.getSearchComponent().search("spring boot");
		Assert.assertTrue(this.googlePage.getSearchResult().isAt());
		Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
		
	}
	
}
