package stepsdefinitions;

import static utils.Utils.*;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageobjects.BasePage;
import pageobjects.LoginPage;

public class Hooks {

	@Before(order = 1)
	public void suitUp() {
		acessarSistema();
	}

	@Before(order = 2, value = "@ManterCadastro")
	public void fazerLogin() {
		LoginPage LoginPage = new LoginPage();
		LoginPage.realizarLogin();

		BasePage BasePage = new BasePage();
		BasePage.ValidarLogin();
	}

	@After()
	public void tearDown(Scenario scenario) throws Exception {
	   capturarScreenshot(scenario);
		driver.quit();
	}

}
