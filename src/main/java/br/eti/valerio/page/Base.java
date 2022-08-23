package br.eti.valerio.page;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Base {

	@Autowired
	public WebDriver driver;

	@Autowired
	public WebDriverWait wait;

	@PostConstruct
	private void init() {
		PageFactory.initElements(this.driver, this);
	}

	public abstract boolean isAt();

}
