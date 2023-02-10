package Steps;

import org.openqa.selenium.By;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		m.abrirNavegador(url);
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() throws InterruptedException {
		m.clicar(By.id("onetrust-accept-btn-handler"));
		m.pausa(5000);
		
		m.clicar(e.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() throws InterruptedException {
		m.clicar(e.getBtnAbrirContaParaVoce());
		m.pausa(6000);
		
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() throws InterruptedException {
		
;
		m.preencher(e.getCampoNome(), "claudiney");
		m.preencher(e.getCampoTelefone(), "11111111111");
		m.preencher(e.getCampoEmail(), "teste@teste.com.br");
		m.preencher(e.getCampoCpf(), "30104479060");

	}

	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() throws InterruptedException {
		m.pausa(5000);
		m.clicar(e.getBtnQueroSerCliente());

	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(5000);
	m.validarTexto(e.getTextoFaltaPouco(), " Falta pouco! ");
    m.fecharNavegador();
	}

}
