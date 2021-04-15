package pageobjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelaUsuariosPage {

	public TelaUsuariosPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr/td[2]")
	private List<WebElement> listaUsuarios;

	public void ValidarUsuario(String nomeDoUsuario) {
		// outro metodo de validação
		// assertTrue(driver.findElement(By.xpath("//tr/td[.='"+nomeDoUsuario+"']")).isDisplayed());
		boolean usuarioExiste = false;
		for (WebElement usuarioLista : listaUsuarios) {
			if (usuarioLista.getText().equals(nomeDoUsuario)) {
				usuarioExiste = true;
				System.out.println("O usuario cadastrado foi:" + nomeDoUsuario);
				break;
			}
		}
		assertTrue(usuarioExiste);
	}

	public void listaUsuariosCadastrados() {
		for (WebElement usuarioLista : listaUsuarios) {
			System.out.println("Usuarios: " + usuarioLista.getText());

		}

	}
	
	public void ValidarUsuarioExcluido(String nomeDoUsuario) {
		boolean usuarioNaoExiste = false;
		for (WebElement usuarioLista : listaUsuarios) {
			if (usuarioLista.getText().equals(nomeDoUsuario)) {
				usuarioNaoExiste = true;
				break;
			}
		}
		assertFalse(usuarioNaoExiste);
		System.out.println("O usuario que eu excluir foi: "+nomeDoUsuario);
		nomeDoUsuario.contains(nomeDoUsuario);
	}
	
}
