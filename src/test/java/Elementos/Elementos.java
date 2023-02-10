package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class Elementos {
	
	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	
    private By BtnAbrirContaParaVoce = By.id("bt1");
    private By CampoNome = By.id("nome");
    private By CampoTelefone = By.id("telefone");
    private By CampoEmail = By.id("email");
    private By CampoCpf = By.id("cpf");
    private By btnQueroSerCliente = By.id("btnEnviar");
    private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
    private By abrirContaPj = By.id("bt2");
    private By abrirContaUnica = By.id("bt3");
    
    
    
	public By getAbrirContaPj() {
		return abrirContaPj;
	}
	public By getAbrirContaUnica() {
		return abrirContaUnica;
	}
	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}
	public By getBtnAbrirContaParaVoce() {
		return BtnAbrirContaParaVoce;
	}
	public By getCampoNome() {
		return CampoNome;
	}
	public By getCampoTelefone() {
		return CampoTelefone;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoCpf() {
		return CampoCpf;
	}
	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
    
}
