package stepsdefinitions;

import static utils.Utils.acessarSistema;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageobjects.TelaUsuariosPage;

public class BaseSteps {

	TelaUsuariosPage TelaUsuariosPage = new TelaUsuariosPage();

	@Dado("que eu acesse o sistema da Stefanini")
	public void que_eu_acesse_o_sistema_da_Stefanini() {
	   acessarSistema();
	}

	@Entao("^O sistema apresenta todos os usuarios$")
	public void oSistemaApresentaTodosOsUsuarios() throws Throwable {
		TelaUsuariosPage.listaUsuariosCadastrados();
	}


}
