package br.eti.valerio.page.google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import br.eti.valerio.page.Base;

@Component
public class SearchResult extends Base{

	@FindBy(css="div.g")
	private List<WebElement> results;
	
	public int getCount() {
		return this.results.size();
	}
	
	@Override
	public boolean isAt() {
		System.out.println("TAMANHO: "+this.results.size());
		return this.wait.until((d) -> !this.results.isEmpty());
	}

}
