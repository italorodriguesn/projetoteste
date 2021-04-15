package pageobjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "senha")
	private WebElement password;
	

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoLogin;

	public void preencherUsername(String id) {
		userName.sendKeys(id);
	}

	public void preencherPassword(String senha) {
		password.sendKeys(senha);
	}

	public void clicarBotaoLogin() {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementByXpath('//button[@type='submit']').click();");
		botaoLogin.click();
	}

	public void realizarLogin() {
		preencherUsername("ADM");
		preencherPassword("MASTER");
		clicarBotaoLogin();
	}
	
	 public void ValidarMensagemLogin() throws Throwable {
		 Alert alertaLogin = driver.switchTo().alert();
		 System.out.println(alertaLogin.getText());
		 driver.switchTo().alert().accept();
	 }
	
	public static void validarLoginInvalido(String LoginIn) throws Exception {
		Alert alert = driver.switchTo().alert();
		System.out.println("o valor da mensagem recebida foi: "+alert.getText());
	    // driver.switchTo().alert().accept();
		//assertEquals(LoginIn, alert.getText());
		assertEquals("Usuário ou Senha Inválidos!", alert.getText());
	
		
}
	
}
