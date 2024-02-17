package alert.teste;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alert.elementos.Elementos;
import alert.navegador.Navegador;
import metodos.Metodos;

public class Testes {

	Metodos metodos = new Metodos();
	
	@BeforeEach
	public void antesDoTeste() {
		Navegador.abrirNavegador();
	}
	
	@AfterEach

    public void depoisDoTeste() {
        Navegador.fecharNavegador();
    }
	
	@Test
	public void validarAlertUm() {
		metodos.clicar(Elementos.um);
		metodos.validarAlert("You clicked a button");
		metodos.aceitarAlert();
	}
	
	@Test
	public void validarAlertDois() {
		metodos.clicar(Elementos.dois);
		metodos.pausa();
		metodos.validarAlert("This alert appeared after 5 seconds");
		metodos.aceitarAlert();
		
	}
	
	@Test
	public void validarAlertTresOk() {
		metodos.clicar(Elementos.tres);
		metodos.validarAlert("Do you confirm action?");
		metodos.aceitarAlert();
	}
	
	@Test 
	public void validarAlertTresCancelar() {
		metodos.clicar(Elementos.tres);
		metodos.validarAlert("Do you confirm action?");
		metodos.cancelarAlert();
	}
	
	@Test
	public void validarAlertQuatro() {
		metodos.clicar(Elementos.quatro);
		metodos.escrever();
		metodos.validarAlert("Please enter your name");
		metodos.aceitarAlert();
	}
	
}
