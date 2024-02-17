package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import elementos.Elementos;
import metodos.Metodos;
import navegador.Navegador;

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
	public void validarModalUm() {
		metodos.clicar(Elementos.um);	
		metodos.clicar(Elementos.fecharUm);
		
	}
	
	@Test
	public void validarModalDois() {
		metodos.clicar(Elementos.dois);	
		metodos.clicar(Elementos.fecharDois);
	}
}
