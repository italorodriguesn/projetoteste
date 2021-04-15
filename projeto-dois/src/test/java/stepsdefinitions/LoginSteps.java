package stepsdefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.BasePage;
import pageobjects.LoginPage;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();
	BasePage basePage = new BasePage();

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String id) {
		loginPage.preencherUsername(id);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		loginPage.preencherPassword(senha);
	}

	@E("acionar o botao entrar")
	public void acionarOBotaoEntrar() throws Exception {
		loginPage.clicarBotaoLogin();
		Thread.sleep(3000);
	}

	@Entao("o sistema apresenta a mensagem {string}")
	public void oSitemaApresentaAMensagem(String LoginIn) throws Exception {
		LoginPage.validarLoginInvalido(LoginIn);
	}

	@Entao("^o sitema apresenta a tela de administrador logado \"([^\"]*)\"$")
	public void oSitemaApresentaATelaDeAdministradorLogado(String textovalidarlogin) throws Throwable {
		basePage.ValidarAdmLogado(textovalidarlogin);
	}

	@E("^o sitema apresenta a tela apresenta a imagem$")
	public void oSitemaApresentaATelaApresentaAImagem() throws Throwable {
		basePage.ValidarImagemAdmLogado();
	}

	//@Entao("^o sitema apresenta a mensagem de usuario invalido$")
	//public void oSitemaApresentaAMensagemDeUsuaroInvalido() throws Throwable {
	//	LoginPage.validarLoginInvalido();
	//}

}