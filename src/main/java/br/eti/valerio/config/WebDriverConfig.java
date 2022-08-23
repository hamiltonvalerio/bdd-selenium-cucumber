package br.eti.valerio.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {
	
	@Value("${default.timeout:60}")
	private int timeout;

	@Bean
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup();
		return new ChromeDriver();
	}
	
	@Bean
	public WebDriverWait webDriverWait(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
	}
	
}
