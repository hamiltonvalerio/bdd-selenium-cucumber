package br.eti.valerio.page.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.eti.valerio.page.Base;

@Component
public class GooglePage extends Base {

	@Autowired
	private SearchComponent searchComponent;

	@Autowired
	private SearchResult searchResult;

	@Value("${application.url}")
	private String url;

	public void goTo() {
		this.driver.get(url);
	}

	public SearchComponent getSearchComponent() {
		return searchComponent;
	}

	public SearchResult getSearchResult() {
		return searchResult;
	}

	@Override
	public boolean isAt() {
		return this.searchComponent.isAt();
	}

	/*public void close() {
		this.driver.quit();
	}*/

}
