package pageobjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManterUsuarioPage {

	public ManterUsuarioPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nome")
	 private WebElement NomeUsuarioEditar;
	
	@FindBy(xpath = "//select[@id='naj']")
	 private WebElement opcaoNaj;
	
	@FindBy(xpath = "//select/option[5]")
	 private WebElement opcaoNajDois;
	
	@FindBy(id = "senha")
	 private WebElement AddSenha;
	
	@FindBy(id = "matricula")
	 private WebElement MatriculaUsuario;
	
	@FindBy(id = "cargo")
	 private WebElement SelectCargo;
	
	@FindBy(xpath = "//select[@id='cargo']/option[10]")
	 private WebElement SelectCargoDois;
	
	@FindBy(id = "observacao")
	 private WebElement AddObservacao;
	
	@FindBy(id = "btsalvar")
	 private WebElement BotaoSalvar;
	
	 public void EscreverUsuario(String nomeDoUsuario) throws Exception{
		   NomeUsuarioEditar.sendKeys(nomeDoUsuario);
		  
		  }
	 
	 public void EscreverUsuarioEditado(String nomeDoUsuario) throws Exception{
		   NomeUsuarioEditar.clear();
		   NomeUsuarioEditar.sendKeys(nomeDoUsuario);
		  
		  }
	 
	 public void EscolherNaj(){
		   opcaoNaj.click();
		   opcaoNajDois.click();
		  }
	 
	 public void InformarSenha(String SenhaUsuario){
		   AddSenha.clear();
		   AddSenha.sendKeys(SenhaUsuario);
		  }
	 
	 public void InformarMatricula(String Matricula){
		   MatriculaUsuario.clear();
		   MatriculaUsuario.sendKeys(Matricula);
		  }
	 
	 public void InformarCargo(String Ass){
		   SelectCargo.click();
		   SelectCargoDois.click();
		  }
	 
	 public void InformarObservacao(String obs){
		   AddObservacao.clear();
		   AddObservacao.sendKeys(obs);
		  }
	 
	 public void BotaoSalvar(){
		 BotaoSalvar.click();
		  }
	 
}
