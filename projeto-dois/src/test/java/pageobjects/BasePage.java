package pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriverWait espera = new WebDriverWait(driver, 10);
	
	public BasePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul/li[1]")
	 private WebElement textoAdmLogado;
	
	@FindBy(xpath = "//nav/img[1]")
	 private WebElement imagemAdmLogado;
	
	@FindBy(xpath = "//a[2]")
	private List<WebElement> listaEditar;
	
	@FindBy(xpath = "//tr[54]/td/a[2]")
	 private WebElement botaoEditarUser;
	
	@FindBy(xpath = "//tr[1]/td/a[3]")
	 private WebElement botaoExcliurUser;
	
	@FindBy(xpath = "//div/a[1]")
	 private WebElement botaoAddUser;
	
	public void ValidarAdmLogado (String textovalidarlogin){
		assertEquals(textovalidarlogin, textoAdmLogado.getText());
		System.out.println("O texto que recuperei foi: "+ textoAdmLogado.getText());
		}
	
	public void ValidarImagemAdmLogado (){
		assertTrue(imagemAdmLogado.isDisplayed());
		System.out.println("a imagem que recuperei foi: "+ imagemAdmLogado.isDisplayed());  //Pro icone aparecer o retorno tem que dar true
		}
	
  
     public void ClicarBotaoEditarUsuario(){
	   botaoEditarUser.click();
	  }
     
     public void ClicarBotaoCadastrarUsuario(){
    	 botaoAddUser.click();
  	  }
     
     public void ValidarLogin() {
    	 ValidarImagemAdmLogado();
    	 ValidarAdmLogado(textoAdmLogado.getText());
    	 
     } 
     
     public void ClicarBotaoExluirUsuario(){
    	 botaoExcliurUser.click();
  	  }
     
     //public void ValidarListaEditar() {
     //	 nomeDoUsuario="PALMAS";
     //	for (WebElement usuarioEdiLista : listaEditar) {
     //	if (usuarioEdiLista.getText().equals(nomeDoUsuario)) {
     //		usuarioEdicao=usuarioEdiLista;
     //		 usuarioEdicao.click();	
     //		break;
     //	}
     //}

     //  }
}
