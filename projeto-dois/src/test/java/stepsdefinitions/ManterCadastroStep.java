package stepsdefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.BasePage;
import pageobjects.LoginPage;
import pageobjects.ManterUsuarioPage;
import pageobjects.TelaUsuariosPage;

public class ManterCadastroStep {

	BasePage BasePage = new BasePage();
	ManterUsuarioPage ManterUsuarioPage = new ManterUsuarioPage();
	TelaUsuariosPage TelaUsuariosPage = new TelaUsuariosPage();
	LoginPage LoginPage = new LoginPage();

	@Quando("^eu clicar em novo usuario$")
	public void euClicarEmNovoUsuario() throws Throwable {
		BasePage.ClicarBotaoCadastrarUsuario();
		Thread.sleep(2000);
	}

	@Quando("eu clicar no botao de editar do usuario")
	public void euClicarNoBotaoDeEditarDoUsuario() {
		BasePage.ClicarBotaoEditarUsuario();
	}

	@Quando("informar o nome {string}")
	public void informarONome(String nomeDoUsuario) throws Throwable {
		ManterUsuarioPage.EscreverUsuario(nomeDoUsuario);
	}

	@Quando("informar o NAJ {string}")
	public void informarONAJ(String senhaUsuario) {
		ManterUsuarioPage.EscolherNaj();
	}

	@E("^informar a senha do usuario \"([^\"]*)\"$")
	public void informarASenhaDoUsuario(String SenhaUsuario) throws Throwable {
		ManterUsuarioPage.InformarSenha(SenhaUsuario);
	}

	@Quando("informar a matricula {string}")
	public void informarAMatricula(String Matricula) {
		ManterUsuarioPage.InformarMatricula(Matricula);
	}

	@Quando("informar o cargo {string}")
	public void informarOCargo(String Ass) {
		ManterUsuarioPage.InformarCargo(Ass);
	}

	@Quando("informar no campo de observacao {string}")
	public void informarNoCampoDeObservacao(String obs) {
		ManterUsuarioPage.InformarObservacao(obs);
	}

	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() throws Throwable {
		ManterUsuarioPage.BotaoSalvar();
		Thread.sleep(2000);
	}

	@Entao("o sitema apresenta o usuario editado {string}")
	public void oSitemaApresentaOUsuarioEditado(String nomeDoUsuario) {
		TelaUsuariosPage.ValidarUsuario(nomeDoUsuario);
		
	}

	@Quando("O sistema apresenta o usuario {string}")
	public void oSistemaApresentaOUsuario(String nomeDoUsuario) throws Throwable {
		TelaUsuariosPage.ValidarUsuario(nomeDoUsuario);
	}

	@Entao("^o sistema apresenta o alerta \"([^\"]*)\"$")
	public void oSistemaApresentaOAlerta(String arg1) throws Throwable {
		LoginPage.ValidarMensagemLogin();
		Thread.sleep(5000);
	}

	
	@Quando("Limpar e informar o nome {string}")
	public void limparEInformarONome(String nomeDoUsuario) throws Throwable {
		ManterUsuarioPage.EscreverUsuarioEditado(nomeDoUsuario);
	}

	@Quando("eu clicar no botao de excluir usuario {string}")
	public void euClicarNoBotaoDeExcluirUsuario(String nomeDoUsuario) {
		BasePage.ClicarBotaoExluirUsuario();
	}

	@Entao("o sistema apresenta o usuario excluido {string}")
	public void oSistemaApresentaOUsuarioExcluido(String nomeDoUsuario) {
	   TelaUsuariosPage.ValidarUsuarioExcluido(nomeDoUsuario);
	}

	@Entao("^o sistema apresenta a tela de alerta$")
	public void oSistemaApresentaATelaDeAlerta() throws Throwable {
		LoginPage.ValidarMensagemLogin();
	}

}
